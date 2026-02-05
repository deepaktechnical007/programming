import java.util.Scanner;
import java.util.Arrays;


public class Array1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Array Size : ");
        int size = sc.nextInt();
        int [] arr = new int [size];
        for(int i=0; i<arr.length;i++){
            System.out.println("Enter a Data at index postion is : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("------------------------------------------------------");

        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("------------------------------------------------------");
        for(int i : arr){
            System.out.println(i);
        }
        System.out.println("-------------------------------------------------------");

        System.out.println(Array.toString(arr));
         
    }
}
