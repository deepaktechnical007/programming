public class hollowDownTriangle {
    public static void main(String[] args) {
        
        int num= 3;
        for(int row =1; row<= num; row++){
            for(int col=1; col<=num*2-1;col++){

                if(row == col || row+col == num*2 || row ==1){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}

