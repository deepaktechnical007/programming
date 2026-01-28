package Day18;

public class Num2 {
    public static void main(String[] args) {
        
        int num =3;
        int count = 0;

        for(int row = 1; row <= num; row++){
            for(int col = 1; col <=num; col++){
                count++;
                System.out.print(count+" ");
            }
            
            System.out.println();
        }

    }
}
