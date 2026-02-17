package Day30;

import java.util.Arrays;

public class SortArray1 {
    public static void main(String[] args) {
        int[] a = { 10, 3, 11, 2, 9, 15, 1 };

        System.out.println(Arrays.toString(SortArray1(a)));
    }

    public static int[] SortArray1(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
        return a;
    }
}