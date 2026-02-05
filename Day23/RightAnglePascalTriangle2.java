package Day23;

public class RightAnglePascalTriangle2 {
    public static void main(String[] args) {
        
        int num =4;

        for(int row =1; row<=num*2-1;row++){
            for(int col =1; col<=num;col++){

                if(row<=col || row+col >= num*2)
                    System.out.print("*"+" ");
                else
                    System.out.print("-"+" ");
            }
            System.out.println();
        }
    }
}
