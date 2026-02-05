package Day23;

public class RightAnglePascalTriangle1 {
    public static void main(String[] args) {
        
        int num =3;

        for(int row =1; row<=num*2-1;row++){
            for(int col =1; col<=num;col++){

                if(row==col || col ==1 || row+col == num*2)
                    System.out.print("*"+" ");
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
