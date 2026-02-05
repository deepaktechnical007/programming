package Day24;

public class Jpattern {
    public static void main(String[] args) {
        int num = 5;

        for(int row=1; row<=num;row++){
            for(int col =1; col<=num;col++){
                if(row ==1 || col == (num+1)/2 || row==num && col<=(num+1)/2)
                System.out.print("*"+" ");
                else
                System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
