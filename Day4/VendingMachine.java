package Day4;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 for Coffee \n Press 2 for Tea \n Press 3 for Soda");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You are selected coffee");
                    System.out.println("Press 1 For Small Size \n Press 2 For Medium Size \n Press 3 For Large Size");
                    System.out.println("Choose your size: ");

                    switch (sc.nextInt()) {
                        case 1:
                            System.out.println("You are selected Small Size Coffee is price at $1.50");
                            break;
                        case 2:
                            System.out.println("You are selected Medium Size Coffee is price at $2.00");
                            break;
                        case 3:
                            System.out.println("You are selected Large Size Coffee is price at $2.50");
                            break;
                        default:
                            System.out.println("Invalid Size Selected");
                    }
                    break;
                case 2:
                    System.out.println("You are selected tea");
                    System.out.println("Press 1 For Small Size \n Press 2 For Medium Size \n Press 3 For Large Size");
                    System.out.println("Choose your size: ");

                    switch (sc.nextInt()) {
                        case 1:
                            System.out.println("You are selected Small Size Tea is price at $1.00");
                            break;
                        case 2:
                            System.out.println("You are selected Medium Size Tea is price at $1.50");
                            break;
                        case 3:
                            System.out.println("You are selected Large Size Tea is price at $2.00");
                            break;
                        default:
                            System.out.println("Invalid Size Selected");
                    }
                    break;

                case 3:
                    System.out.println("You are selected soda");
                    System.out.println("Press 1 For Small Size \n Press 2 For Medium Size \n Press 3 For Large Size");
                    System.out.println("Choose your size: ");

                    switch (sc.nextInt()) {
                        case 1:
                            System.out.println("You are selected Small Size Soda is prince at $1.50");
                            break;
                        case 2:
                            System.out.println("You are selected Medium Size Soda is price at $2.00");
                            break;
                        case 3:
                            System.out.println("You are selected Large Size Soda");
                            break;
                        default:
                            System.out.println("Invalid Size Selected");
                    }
                default:
                    break;

                case 4:
            }
        }

    }
}
