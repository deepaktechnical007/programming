//Write a program to Check given number is a multiple of 8 or not and return a suitable message.

public class Program4 {
    
    public static void multiple(int a){

        if(a %8 ==0){
            System.out.println("Here "+a+" is a multiple of 8.");
        }
       
    }
    public static void main(String[] args) {
       
        multiple(16);

    }
}
