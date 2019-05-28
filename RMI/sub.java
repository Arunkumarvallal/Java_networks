/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rec;

import static java.lang.Math.abs;

/**
 *
 * @author Arunkumarvallal
 */
public class sub implements Rec {
    
    @Override
    public int add(int i,int j){
        int sum=i+j;
        System.out.println("ADDITION OF TWO NUMBERS"+sum);
    return 0;
    }
    @Override
   public int subt(int i,int j){
        int dif=abs(i-j);
       System.out.println("SUBTRACTION OF TWO NUMBERS"+dif);
        return 0;
    }
   public static void main(String[] argds){
   }
    
}
