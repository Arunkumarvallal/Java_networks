import java.io.*;
import java.net.Socket;

public class fileclient {
    public static void main(String args[]) throws IOException {
        Socket client=new Socket("localhost",7889);

FileInputStream f=new FileInputStream("C:\\Users\\Arunkumarvallal\\Desktop\\b.txt");
        byte myby[]=new byte[87687];
        f.read(myby,0,myby.length);
        OutputStream filein=client.getOutputStream();
        filein.write(myby,0,myby.length);
f.close();
client.close();
    }


}
