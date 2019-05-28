/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rec;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


/**
 *
 * @author Arunkumarvallal
 */
public class server {
    public static void main(String arhs[]){
        
        try {
            ServerSocket ssoc=new ServerSocket(4765);
            Socket soc=ssoc.accept();
            DataInputStream din=new DataInputStream(soc.getInputStream());
            int first=Integer.parseInt(din.readUTF());
            int second=Integer.parseInt(din.readUTF());
            System.out.println(first+"\n"+second);
            sub a=new sub();
            a.add(first, second);
            a.subt(first, second);
            soc.close();



        } catch (IOException e) {
            System.out.println(e); }
    }
}
