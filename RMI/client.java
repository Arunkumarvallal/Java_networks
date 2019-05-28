/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rec;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Arunkumarvallal
 */
public class client {
    public static void main(String[] args){
        try{
            
        
    Socket soc=new Socket("localhost",4765);
            DataOutputStream dout=new DataOutputStream(soc.getOutputStream());
            Scanner scan=new Scanner(System.in);
                String first,second;
               System.out.println("ENTER THE TWO VALUES FOR ADDITION AND SUBTRACTION ");
                first=scan.nextLine();
                second=scan.nextLine();
                        dout.writeUTF(first);
                        dout.writeUTF(second);
                        soc.close();
                        
                    
                
        }
        catch (Exception  e){
            System.out.println(e);
        }
    
    }
    
    
}
