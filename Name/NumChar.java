package Name;

public class NumChar {

    public static void main(String[] args) {
        int num = 3;
        char ch = 'A';
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {

                ch++;
                if (row == col) {
                    System.out.print(row +" ");
                } else {
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }
    }
}
