package Day18;

public class Num13 {
    public static void main(String[] args) {

        int num = 4;
        int sum = 1;
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                if (row >= col) {
                    if (row + col <= num + 4) {
                        System.out.print((sum) + " ");
                        sum++;
                    }
                }

                System.out.print("");
            }
            System.out.println();
        }
    }
}
