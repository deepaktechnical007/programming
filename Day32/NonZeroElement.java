package Day32;

import java.util.Arrays;

public class NonZeroElement {
    public static void main(String[] args) {

        int[] a = { 0, 1, 0, 3, 12 };
        int[] b = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b[j++] = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 0;
                b[j++] = a[i];

            }
        }
        System.out.println(Arrays.toString(b));

    }
}