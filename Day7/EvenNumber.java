package Day7;

import java.util.Scanner;

public class EvenNumber {
   
    public static String solution(int num){
        int a = num;
        String result = a + " not start with even Number";
        while (num>10) {
            num=num/10;
        }
        if ( num %2 ==0) {
            result = a +" start with even Number";
        }
        return result;
    }
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println(solution(num));
    }
}
