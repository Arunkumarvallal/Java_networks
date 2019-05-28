import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

public static void main(String args[]) throws IOException {

    ServerSocket server=new ServerSocket(4253);
    Socket connection=server.accept();
    DataInputStream data=new DataInputStream(connection.getInputStream());
    String received=data.readUTF();
    System.out.println(received);
    server.close();
    connection.close();

}
}
