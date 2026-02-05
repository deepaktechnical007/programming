package Day23;

public class DiamandNum {
    public static void main(String[] args) {

        int num = 3;
        for (int row = 1; row <= num * 2 - 1; row++) {
            int a = 0;
            for (int col = 1; col <= num * 2 - 1; col++) {

                if (row + col >= num + 1 && col - row <= num - 1 && row - col <= num - 1 && row + col <= num * 3 - 1) {
                    if (col <= num)
                        System.out.print(++a + " ");
                    else
                        System.out.print(--a + " ");
                } else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
