package Day24;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Value : ");
        int num = 5;

        for(int row =1; row<=num*2-1; row++){
            for(int col =1;col<=num*2-1; col++){
        
                if(row==col || row+col==num*2 || col==1 || col ==num*2-1){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}