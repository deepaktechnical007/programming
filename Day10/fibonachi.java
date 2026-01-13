//wap to java the fibonachi serices

import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int first = 0;
        int second = 1;

        for (int i = 1; i <= num; i++) {

            System.out.println(first);

            int temp = first + second;
            first = second;
            second = temp;

        }

    }
}
