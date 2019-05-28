import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.net.Socket;

public class client {

    public static void main(String args[]) throws Exception
    {
        try
    {

        Socket soc;
        BufferedImage img = null;
        soc=new Socket("localhost",4887);
        System.out.println("Client is running. ");

            System.out.println("Reading image from disk. ");
            img = ImageIO.read(new File("F:\\INFORMATION\\WALLPAERS\\HD WALLPAPER\\New folder\\one.jpg"));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(img, "jpg", baos);
            baos.flush();
            byte[] bytes = baos.toByteArray();
            baos.close();
            System.out.println("Sending image to server. ");
            OutputStream out = soc.getOutputStream();
            DataOutputStream dos = new DataOutputStream(out);
            dos.writeInt(bytes.length);
            dos.write(bytes, 0, bytes.length);
            System.out.println("Image sent to server. ");
            dos.close();
            out.close();
            soc.close();
    }


        catch (Exception e)
        {
            System.out.println("Exception: " + e.getMessage());

        }

    }

}
