package Day6;

import java.util.Scanner;

public class LcmNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second Number : ");
        int b = sc.nextInt();
        System.out.println(findLCM(a, b));
    }

    public static String findLCM(int a, int b) {
        int max = a > b ? a : b;
        while (true) {
            if (max % a == 0 && max % b == 0) {
                return "LCM of : " + a + " and " + b + " is : " + max;
            }

            max++;
        }

    }

}
