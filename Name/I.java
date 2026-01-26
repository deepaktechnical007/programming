package Name;

public class I {
    public static void main(String[] args) {

        int num = 5;

        for (int row = 1; row <= num; row++ ) {
            for (int col = 1; col <= num; col++) {

                if (row == 1 || col == (num / 2) + 1 || row == 5)
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }
            System.out.println();

        }
    }
}
