import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        try {
            ServerSocket sc = new ServerSocket(6456);

            Socket sockets = sc.accept();
            DataOutputStream dout = new DataOutputStream(sockets.getOutputStream());
            DataInputStream din=new DataInputStream(sockets.getInputStream());
            String ip[]=new String[3];
   System.out.println("Enter the Ip address");
        for(int i=0;i<3;i++){
            ip[i]=scan.nextLine();
        }

            System.out.println("Enter the MAC address");
        String mac[]=new String[3];
        for(int i=0;i<3;i++){
            mac[i]=scan.nextLine();
        }
        System.out.println("ip\t\t\t\t mac");
        for(int i=0;i<3;i++){
            System.out.println(ip[i]+"\t\t  "+mac[i]);
        }

            String userip=din.readUTF();

            for (int i=0;i<3;i++){
            if(ip[i].equals(userip)){
                dout.writeUTF(mac[i]);
                dout.flush();
                break;
            }
            else{
                System.out.println("NO IP FOUND");
            }
            }

        sockets.close();
        }

catch (Exception e){
            System.out.println(e);
}
    }
}
