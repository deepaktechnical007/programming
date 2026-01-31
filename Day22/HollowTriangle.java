public class HollowTriangle {
    
     public static void main(String[] args) {
        
        int num= 4;
        for(int row =1; row<= num; row++){
            for(int col=1; col<=num*2-1;col++){

                if(row==col||col==1||row==num||col+row==num*2||col==num*2-1){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}

