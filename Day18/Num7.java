package Day18;

public class Num7 {
    public static void main(String[] args) {
        int num = 3;
        for (int row = 1; row <= num; row++) {
            char ch = 'A';

            for (int col = 1; col <= num; col++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
