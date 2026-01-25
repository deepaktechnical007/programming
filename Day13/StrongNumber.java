package Day13;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Strong Number: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            temp /= 10;
        }
        System.out.println(sum == num ? num + " is a Strong Number" : num + " is not a Strong Number");
    }
}
