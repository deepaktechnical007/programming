package Day5;

import java.util.Scanner;

public class SpyNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(findSpy(num));

    }

    public static String findSpy(int num) {

        int prod = 1;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            prod *= rem;
            sum += rem;
            num /= 10;
        }
        if (sum == prod)
            return "Given Number is Spy Number";
        else
        return "Given Number is Not Spy Number";  
    }
}
