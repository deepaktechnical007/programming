import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st value : ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd value : ");
        int b = sc.nextInt();
        int sum = a + b;

        if (sum % 8 == 0) {
            System.out.println("The sum is divisible by 8");
        } else {
            System.out.println("It is not divisible 8");
        }

    }

}
