package Day5;

import java.util.Scanner;

public class FindProduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(findProduct(num));

    }

    public static int findProduct(int num) {

        int prod = 1;
        while (num > 0) {
            int rem = num % 10;
            prod *= rem;
            num /= 10;
        }
        return prod;
    }
}
