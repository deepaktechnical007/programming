package Day5;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(findSum(num));

    }

    public static int findSum(int num) {

        int sum = 0;

        while (num > 0) {
            int rem = num % 10;

            sum+= rem;
            num /= 10;
        }
        return sum;
    }
}
