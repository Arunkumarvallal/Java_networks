import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String args[]) throws Exception
    {
        try {
            ServerSocket server = null;
            Socket socket;
            server = new ServerSocket(4887);
            System.out.println("Server Waiting for image");
            socket = server.accept();
            System.out.println("Client connected.");
            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);
            int len = dis.readInt();
            System.out.println("Image Size: " + len / 1024 + "KB");
            byte[] data = new byte[len];
            dis.readFully(data);
            dis.close();
            in.close();
            InputStream ian = new ByteArrayInputStream(data);
            BufferedImage bImage = ImageIO.read(ian);
            JFrame f = new JFrame("Server");
            ImageIcon icon = new ImageIcon(bImage);
            JLabel l = new JLabel();
            l.setIcon(icon);
            f.add(l);
            f.pack();
            f.setVisible(true);
            socket.close();
        }
        catch (Exception e){
    System.out.println(e);
    }
        }


}