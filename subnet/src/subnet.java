import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class subnet {
public static void main(String a[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("ENTER THE IP ADDRESS");
    String ip = sc.nextLine();
    String split_ip[]=ip.split("\\.");
    int cl=Integer.parseInt(split_ip[0]);
    System.out.println("Enter the CIDR VALUE:");
    int n = sc.nextInt();
    if(cl>=192&&cl<=223) {
split_ip[3]= "0";
        System.out.println("THE NETWORK ID IS "+split_ip[0]+"."+split_ip[1]+"."+split_ip[2]+"."+split_ip[3]);
        int subnet = Math.abs(24 - n);
        int subnetmask = (int) Math.pow(2, subnet);
        int host = 8 - subnet;
        int hostid = (int) Math.pow(2, host);
        System.out.println("The NUMBER OF SUBNET is"+subnetmask);
        System.out.println("THE HOST IS"+hostid);

    }
    else if(cl<=127){
        for(int i=1;i<=3;i++){
            split_ip[i]="0";
        }
        System.out.println("THE NETWORK ID IS "+split_ip[0]+"."+split_ip[1]+"."+split_ip[2]+"."+split_ip[3]);

        int subnet = Math.abs(8 - n);
        int subnetmask = (int) Math.pow(2, subnet);
        int host = 24 - subnet;
        int hostid = (int) Math.pow(2, host);
        System.out.println("The NUMBER OF SUBNET is"+subnetmask);
        System.out.println("THE HOST IS"+hostid);

    }

    else if(cl>=128&&cl<=191){

        for(int i=2;i<=3;i++){
            split_ip[i]="0";
        }
        System.out.println("THE NETWORK ID IS "+split_ip[0]+"."+split_ip[1]+"."+split_ip[2]+"."+split_ip[3]);

        int subnet = Math.abs(16 - n);
        int subnetmask = (int) Math.pow(2, subnet);
        int host = 16 - subnet;
        int hostid = (int) Math.pow(2, host)-2  ;
        System.out.println("The NUMBER OF SUBNET is"+subnetmask);
        System.out.println("THE HOST IS"+hostid);

    }

}
    static String appendZeros(String s){
        String temp= "00000000";
        return temp.substring(s.length())+ s;

}
}
