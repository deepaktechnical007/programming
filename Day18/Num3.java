package Day18;

public class Num3 {
    public static void main(String[] args) {

        int num = 4;
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                if (row >= col)
                    System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
