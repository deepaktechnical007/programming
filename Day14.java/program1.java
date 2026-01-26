// Wap to print lower case Alphabeta and also asecii value
public class program1 {
    public static void main(String[] args) {

        for(char ch='A';(ch>='A'&& ch<='Z') || ( ch >='a' && ch <= 'z');ch++);
        {
            System.out.println(ch +" : "+(int)ch);
        }

       
    }
}
