import java.util.Scanner;

public class Program1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Allen Age : ");
        int age = sc.nextInt();
        
        if(age % 2 == 0 ){
            System.out.println("Allen is correct");
        }
        else{
            System.out.println("Allen is not correct");
        }
    }
}
