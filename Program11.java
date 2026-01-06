import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values : ");
        int a = s.nextInt();

        if (a>0) {
            System.out.println("Postive Number");
        } else if (a==0) {
            System.out.println("zero Number");
        } else {
            System.out.println("Nagative Number");
        }

    }
}
