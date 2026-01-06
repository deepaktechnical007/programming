// Write a program to Check the given number is positive or negative then return suitable message

public class Program6 {
    public static void main(String[] args) {

        postiveNumber(10);
    }

    public static void postiveNumber(int num){

        if(num >= 0){
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Negative");
        }
    }
}
