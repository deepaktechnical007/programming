package Day31;

public class Program1 {
    public static void main(String[] args) {
        
        int [] a ={16,17,4,3,5,2};
        int max = a[a.length-1];
        System.out.println(max);
        for(int i=a.length-2;i>=0;i--){
            if(a[i]>max){
                max = a[i];
                System.out.println(max);
            }


        }
    }
}

