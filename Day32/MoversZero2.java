package Day32;

import java.util.Arrays;

public class MoversZero2 {

    public static void main(String[] args) {
        int[] a = { -1, 1, -8, 3, 12, -9 };

        System.out.println(Arrays.toString(move(a)));
    }

    public static int[] move(int[] a) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                j++;
            }
        }
        return a;
    }
}
