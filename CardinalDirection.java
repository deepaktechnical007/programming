import java.util.Scanner;

public class CardinalDirection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the direction (North, South, East, West): ");
        String Direction = sc.nextLine();

        switch (Direction) {

            case "North":
                System.out.println("You are heading north");
                break;

            case "South":
                System.out.println("You are heading south");
                break;

            case "East":
                System.out.println("You are heading East");
                break;

            case "West":
                System.out.println("You are heading West");
                break;

            default:
                System.out.println("You have entered an invalid direction");

        }
    }
}
