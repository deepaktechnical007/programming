package Name;

public class D {
    public static void main(String[] args) {
        int num = 5;
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                if (row == 5 && col <=4|| row ==1 && col <=4 || col ==1 && col <=4) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
