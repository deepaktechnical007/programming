public class part3 {
    public static void main(String[] args) {
        int num = 3;
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                if (row == num || row == num || row + col == num + 1) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();

        }

    }
}
