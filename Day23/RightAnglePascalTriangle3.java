package Day23;

import java.util.Scanner;

public class RightAnglePascalTriangle3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter the number : " );
        int num =sc.nextInt();

        for(int row =1; row<=num*2-1;row++){
            for(int col =1; col<=num;col++){

                if(col== num || row==1 || row==col || row==num*2-1 || row+col ==num*2)
                    System.out.print("*"+" ");
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
