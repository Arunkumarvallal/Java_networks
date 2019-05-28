
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;

import java.net.Socket;
import java.net.Socket;
import java.util.Scanner;

public class server {

    public static void main(String[] args) {
        try {
            ServerSocket sc = new ServerSocket(6456);

            Socket sockets = sc.accept();

            String[] name={"WWW.GOOGLE.COM","WWW.YAHOO.COM"};
            String[] ip={"192.01.12.10","155.23.15.4"};
            int len=name.length;
            DataInputStream inp=new DataInputStream(sockets.getInputStream());
            String rec=inp.readUTF();
            DataOutputStream outd=new DataOutputStream(sockets.getOutputStream());
            for(int i=0;i<len;i++){
                if(rec.equalsIgnoreCase(name[i])){
                    outd.writeUTF(ip[i]);
                    outd.flush();
                    break;
                }
            }
            sc.close();
            sockets.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
