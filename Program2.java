import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int x = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int y = sc.nextInt();

        int sum = x + y;

        if (sum >= 100) {
            System.out.println("It's a huge number");
        }
        else{
            System.out.println("This is sum of two number : "+sum);
        }
    }
}
