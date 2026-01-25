package Day11;

import java.util.Scanner;

public class PerfactNumber {

    public static String checkPerfectNum(int num) {
        String result = num + " is not a Perfect number.";
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }

        if (num == sum)
            result = num + " is Perfect number.";

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.println(checkPerfectNum(num));
    }
}
