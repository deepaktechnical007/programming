package Day18;

public class Num4 {
    
    public static void main(String[] args) {
        int num = 3;

        for(int row =1; row<=num;row++){
            for(int col =1; col<= num; col++){
                if(col % 2==0)
                {
                    System.out.print(0 +" ");
                }
                else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
    }
}
