package Day18;

public class Num15 {

    public static void main(String[] args) {

        int num = 5;

        for (int i = 1; i <= num; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }

            // Spaces
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print(" " + " ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }

        for (int i = num; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }

            // Spaces
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print(" " + " ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }

    }
}
