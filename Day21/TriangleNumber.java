package Day21;

import java.util.Scanner;

public class TriangleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        for (int row = 1; row <= num; row++) {
            int a = 0;
            for (int col = 1; col <= num * 2 - 1; col++) {
                if (row + col >= num + 1 && col - row <= num - 1) {
                    if (col <= num) {
                        a++;
                        System.out.print(a + " ");
                    } else {
                        a--;
                        System.out.print(a + " ");
                    }
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();

        }

    }
}
