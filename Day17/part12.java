public class part12 {
    public static void main(String[] args) {
        int num = 5;
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                if (row == num || col == 1) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();

        }

    }
}
