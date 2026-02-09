package Day26;

import java.util.Arrays;

public class RemoveDuplicateArray2 {
    public static void main(String[] args) {
        
        int [] a = {10,20,10,30,40,20,50};

        int [] b = Arrays.stream(a).distinct().toArray();
        System.out.println(Arrays.toString(b));
    }
}
