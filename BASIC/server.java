
import javax.xml.stream.events.StartDocument;
import java.net.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class server {
    public static void main(String args[]) throws IOException {

        try {
            ServerSocket sc = new ServerSocket(8888);
            Socket s1 = sc.accept();
            //DataInputStream din=new DataInputStream(s1.getInputStream());
            DataOutputStream s2 = new DataOutputStream(s1.getOutputStream());
       Scanner scan = new Scanner(System.in);
            System.out.println("Enter the message to send from server to client ");
            String a=scan.nextLine();
            s2.writeUTF(a);
            s2.flush();
           // String b=din.readUTF();
            //System.out.println("The message from client is :"+b);
            s1.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
