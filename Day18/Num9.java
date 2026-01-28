package Day18;

public class Num9 {
    public static void main(String[] args) {

        int num = 4;
        for (int row = 1; row <= num; row++) {
            char ch = 'A';

            for (int col = 1; col <= num; col++) {
                if (row >= col)
                    System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
