package Day27;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element to Search");
        int ele = sc.nextInt();
        int[] a = { 10, 30, 20, 5, 25, 35 };
        System.out.println(isSearch(a, ele));
    }

    private static String isSearch(int[] a, int ele) {
        Arrays.sort(a);
        int st = 0, end = a.length - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (ele == a[mid]) {
                return "Element is found at index is : " + mid;
            } else if (ele > a[mid]) {
                st = mid + 1;
            } else if (ele < a[mid]) {
                end = mid - 1;
                mid = (st + end) / 2;
            }
        }
        return "Element is not found ";
    }
}
