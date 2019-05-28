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
    System.out.println("ENTER THE MESSAGE TO SEND ");
    String send=scan.nextLine();
    data.writeUTF(send);
    data.flush();
    client.close();
}
}
