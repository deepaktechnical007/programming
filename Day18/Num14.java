package Day18;

public class Num14 {
    public static void main(String[] args) {

        int num = 4;
        char ch = 'A';
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                if (row >= col) {
                    if (row + col <= num + 4) {
                        System.out.print((ch) + " ");
                        ch++;
                    }
                }

                System.out.print("");
            }
            System.out.println();
        }
    }
}
