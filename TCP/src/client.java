import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class client
{
public static void main(String args[]) throws IOException {
    Scanner scan =new Scanner(System.in);
    Socket client=new Socket("localhost",4253);
    DataOutputStream data=new DataOutputStream(client.getOutputStream());
    DataInputStream in=new DataInputStream(client.getInputStream());
    System.out.println("ENTER THE MESSAGE TO SEND ");
    String send=scan.nextLine();
    data.writeUTF(send);

    data.flush();
    System.out.println("Waiting for echo msg");
    String echo=in.readUTF();
    System.out.println("Echoed msg is :"+echo);
    client.close();
}
}
