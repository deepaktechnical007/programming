package Day28;

public class MaxNumber {
    public static void main(String[] args) {
        
        int [] a = {10,20,30,40,50,80,60,70};
    
        int max =a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("Maximum Number is : "+max);
    }
}
