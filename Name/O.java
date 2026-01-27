package Name;

public class O {
    public static void main(String[] args) {
        
        int num = 5;
        for(int row =1; row <= num; row++){
            for(int col =1; col <= num; col++){

                if(row ==1 || col ==1 || row == num || col== num  )
                System.out.print("*"+" ");
                else
                System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
