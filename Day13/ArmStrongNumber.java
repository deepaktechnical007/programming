package Day13;

import java.util.Scanner;

public class ArmStrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is on Armstrong Number : ");
        int num = sc.nextInt();

        if (isArmstrong(num))
            System.out.println(num + " is an Armstrong Number");
        else
            System.out.println(num + " is not Armstrong Number");
    }

    public static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        int count = 0;

        while (num > 0) {
            num /= 10;
            count++;
        }
        num = temp;
        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, count);
            num /= 10;
        }
        return sum == num;

    }
}
