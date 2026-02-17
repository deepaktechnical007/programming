import java.util.Scanner;

public class FindAlpha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = sc.next().charAt(0);
        System.out.println(FindAlpha());

    }

    public static String FindAlpha(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            return "Alphabet";
        } else if (ch >= '0' && ch <= '9') {
            return "Given Character is a Digit";
        } else {
            return "Given Character is a Special Character";

        }

    }
}
