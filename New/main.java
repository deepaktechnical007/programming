import java.util.Scanner;

public class main {
    public static String determineColor(String s) {
        // Write your logic here to determine the color based on the string s.
        // Return "Black" or "White" based on the problem statement.

         char columnchar = s.charAt(0);
         char rowchar = s.charAt(1);

         int column = columnchar -'a' +1;
         int row = rowchar -'0';

         if((column +row)% 2 == 0){
            return "Black";
         }
         else{
        return "White";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String result = determineColor(s);
        System.out.println(result);
    }
}