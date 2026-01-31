package Day19;

public class oddnumber {
    public static void main(String[] args) {
        
        int num = 3;
        int count =1;
        for(int row =1; row<= num; row++){
            for(int col = 1; col <= num; col++){
                System.out.print(count+" ");
                count +=2;
                
            }
            System.out.println();
        }
    }
}
