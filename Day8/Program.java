package Day8;

public class Program {

    public static void main(String[] args) {
        int a =1234;
        int product =1;

        while (a>0) {
            
            int lastdigit = a%10;
            product = product*lastdigit;
            a = a/10;

        }
            System.out.println(product);
    

    }
}

