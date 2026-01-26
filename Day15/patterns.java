package Day15;

public class patterns {
    public static void main(String[] args) {
        
        int n =3;

        for(int row =1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                if(row == 1)
                System.out.println("*");
                else
                System.out.print("_");
            }
        }
        System.out.println();
    }
}
