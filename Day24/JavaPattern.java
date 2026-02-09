package Day24;

public class JavaPattern {
    public static void main(String[] args) {
        int num = 5;
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                if (row == 1 || col == (num + 1) / 2 || row == num && col <= (num + 1) / 2)
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                if (row == 1 || col == 1 || col == num || row == (num + 1) / 2)
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }
            System.out.println(" "+" ");
            for (int col = 1; col <= num; col++) {
                if (col == 1 && row <= (num + 1) / 2 || col == num && row <= (num + 1) / 2 || row - col == num / 2
                        || row + col == num + (num / 2) + 1)
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }
            System.out.println();
        }
//            for (int col = 1; col <= num; col++) {
//                if (row == 1 || col == 1 || col == num || row == (num + 1) / 2)
//                    System.out.print("*" + " ");
//                else
//                    System.out.print(" " + " ");
//            }
            System.out.println();
        }
    }
