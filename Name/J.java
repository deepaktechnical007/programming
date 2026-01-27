package Name;

public class J {
    public static void main(String[] args) {

        int num = 5;
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {

                if (row == 1 || col == 3 || row ==5 && col <=3 || row ==4 && col ==1 )
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
