package Day4;
import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = sc.next().charAt(0);
        System.out.println(iaAlphabet(ch));

    }

    public static String iaAlphabet(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            if(ch >= 'a' && ch <= 'z')
            return "Lower Case Alphabet";
         else
            return "Uper Case Alphabet";
        
        } else {
            return "Character is not Alphabet";

        }

    }
}
