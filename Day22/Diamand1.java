public class Diamand1 {
    public static void main(String[] args) {
        
        int num= 3;
        for(int row =1; row<= num*2-1; row++){
            for(int col=1; col<=num*2-1;col++){

                if(row+col<=num+1 || col-row>=num-1 || row+col >= (num*3)-1 || row-col>=num-1){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("-"+" ");
                }
            }
            System.out.println();
        }
    }
}

