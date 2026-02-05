public class Array {
    public static void main(String[] args) {
        
        int [] a = {10,20,30};
        int sum =0;

        for(int i=0; i<a.length;i++){
            sum =a[i]+sum;
        }
        int avg = sum /a.length;
        System.out.println(avg);
    }
}
