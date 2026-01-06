package Day4;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class EvenNum {
    
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
    System.out.println("Enter the First number ");
    int a = sc.nextInt();
    System.out.println("Enter the Second Number ");
    int b = sc.nextInt();
    System.out.println("Enter the Third Number ");
    int c = sc.nextInt();

    if(a%2 ==0 && b%2 ==0 && c%2 ==0)
    {
        System.out.println("Product");
    }
 }
}
