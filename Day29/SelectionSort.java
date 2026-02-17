package Day29;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = { 15, 100, 20, 30, 25, 5 };
        System.out.println(Arrays.toString(isSort(a)));
    }
 
    private static int[] isSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int ind = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[ind]) {
                    ind = j;
                }
            }

            if (i != ind) {
                a[i] = a[i] + a[ind];
                a[ind] = a[i] - a[ind];
                a[i] = a[i] - a[ind];
            }
        }
        return a;
    }
}
