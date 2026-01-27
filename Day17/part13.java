public class part13 {
    public static void main(String[] args) {
        int num = 5;
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                if (row == num || row == 1 || row + col == num + 1) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();

        }

    }
}
