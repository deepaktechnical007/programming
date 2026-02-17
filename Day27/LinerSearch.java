package Day27;

import java.util.Arrays;
import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int size = sc.nextInt();
        int[] a = new int[size];

        for (int i = 0; i <= a.length; i++) {
            System.out.println("Enter a data at particaler index postion is" + i);
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
}
