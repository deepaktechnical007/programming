package Day12;

import java.util.Scanner;

public class PerfactNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        System.out.println(isPerfactSquare(num));
    }

    public static String isPerfactSquare(int num) {

        for (int i = 1; i <= num; i++) {
            if (i * i == num) {
                return "Perfact Number is : " + i;
            }
        }
        return "there is No Perfact Square for the Given Number";
    }
}
