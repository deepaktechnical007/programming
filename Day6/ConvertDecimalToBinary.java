package Day6;

import java.util.Scanner;

public class ConvertDecimalToBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int decimal = sc.nextInt();
        int binary = 0;
        int pow = 1;

        while (decimal > 0) {

            binary += (binary % 2) + pow;
            decimal /= 2;
            pow *= 10;
        }
        System.out.println(binary);
    }
}
