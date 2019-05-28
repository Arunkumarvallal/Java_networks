import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        try

        {
            Scanner scan=new Scanner(System.in);
            Socket socketc = new Socket("localhost", 6456);

            DataInputStream dis = new DataInputStream(socketc.getInputStream());
            DataOutputStream dout=new DataOutputStream(socketc.getOutputStream());
            System.out.println("ENTER THE IP ADDRESS");
            String ip=scan.nextLine();
            dout.writeUTF(ip);
            dout.flush();
            String ae= dis.readUTF();
            System.out.println("The physical Address is:"+ae);
            socketc.close();


        }
    catch (Exception e){
            System.out.println(e);

    }
    }

}

