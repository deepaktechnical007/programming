package Day7;

import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a = sc.nextInt();
        int num = a * a;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        if (sum == a) {
            System.out.println(a + " is a neon Number");
        } else {
            System.out.println(a + " is not a neon Mumber");
        }

    }
}
