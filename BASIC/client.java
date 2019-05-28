import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {
        try{
        Scanner scan =new Scanner(System.in);


        Socket s = new Socket("localhost", 8888);
        //DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String a=dis.readUTF();
        System.out.println("The Message from the server is :\n"+a);
        //String b=scan.nextLine();
        //dout.writeUTF(b);
        //dout.flush();
        s.close();

    }

    catch (Exception e ){
            System.out.println(e);
    }
}
}