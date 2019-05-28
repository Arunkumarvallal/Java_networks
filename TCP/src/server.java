import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

public static void main(String args[]) throws IOException {

    ServerSocket server=new ServerSocket(4253);
    Socket connection=server.accept();
    DataInputStream data=new DataInputStream(connection.getInputStream());
    DataOutputStream out=new DataOutputStream(connection.getOutputStream());
    String received=data.readUTF();
    System.out.println(received);
    out.writeUTF(received);
    out.flush();
    server.close();
    connection.close();

}
}
