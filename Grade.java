import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade (A, B, C, D, E): ");
        String Grade = sc.nextLine();

        switch (Grade) {
            case "A":
                System.out.println("Excellent!");
                break;

            case "B":
                System.out.println("Good Job");
                break;

            case "C":
                System.out.println("Passing grade");
                break;

            case "D":
                System.out.println("Needs Improvement");
                break;
            case "E":
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid Grade");

        }
    }
}
