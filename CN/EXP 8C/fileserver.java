import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class fileserver {
    public static void main(String[] args) throws IOException {
        ServerSocket servsock = new ServerSocket(7889);
        Socket sock = servsock.accept();
        byte re[]=new byte[2398];
       InputStream inp=sock.getInputStream();
        inp.read(re,0,re.length);
        FileOutputStream  fout= new FileOutputStream("C:\\Users\\Arunkumarvallal\\Desktop\\a.txt");
        fout.write(re,0,re.length);
        FileInputStream readb=new FileInputStream("C:\\Users\\Arunkumarvallal\\Desktop\\a.txt");
        int a=0;
        while(a!=-1){
            a=readb.read();
            char c=(char)a;
            System.out.print(c);
        }
        sock.close();
    }

}
