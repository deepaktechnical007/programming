import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("A values is max");
        } else if (b > a && b > c) {
            System.out.println("B value is max");
        } else {
            System.out.println("C value is max");
        }

    }
}
