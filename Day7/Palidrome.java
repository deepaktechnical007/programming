package Day7;

import java.util.Scanner;

public class Palidrome {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int rev = 0;
        int pow = n;

        while (n>0) {
            int rem = n % 10;
            rev = rev * 10 +rem;
            n = n/10;       
        }
        if (pow == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}
