package Day7;

import java.util.Scanner;

public class XylemOrPhloem {

    public static String Solution(int num){

        String result ="It's a Phloem.";
        int last = num %10;
        num/=10;
        int sum =0;

        while (num>10) {
            sum +=num%10;
            num/=10;
        }
        last +=num;
        if(last == sum)
        result = "It's a Xylem";

        return result;
    }
    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");

        int num = sc.nextInt();

        System.out.println(Solution(num));
        
    }

}
