package Day32;

import java.util.Arrays;

public class AlternativeNumber {
    public static void main(String[] args) {
        int[] a = { -1, 1, -8, 3, 12, -9, 15, -7 };
        int[] b = new int[a.length];
        System.out.println(Arrays.toString(arrange(a)));

    }

    public static int[] arrange(int[] a) {
        int[] b = new int[a.length];
        int nindex = 0;
        int pindex = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0 && nindex < a.length) {
                b[nindex] = a[i];
                nindex += 2;
            } else if (a[i] > 0 && pindex < a.length) {
                b[pindex] = a[i];
                pindex += 2;
            }
        }
        return b;
    }
}