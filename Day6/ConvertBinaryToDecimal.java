package Day6;

import java.util.Scanner;

public class ConvertBinaryToDecimal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int binary = sc.nextInt();
        int decimal =0;
        int pow =1;

    while (binary>0) {
        
        decimal+= (binary%10)+pow;
        binary/=10;
        pow*=2;
    }
         System.out.println(decimal);
    }
}
