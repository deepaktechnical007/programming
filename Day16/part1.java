import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                if (col == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
