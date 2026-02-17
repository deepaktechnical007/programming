package Day27;

import java.util.Scanner;

public class LinerSearch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element to Search");
        int ele = sc.nextInt();
        int[] a = { 10, 30, 20, 40 };
        System.out.println(isSearch(a, ele));
    }

    private static String isSearch(int[] a, int ele) {
        for (int i = 0; i < a.length; i++) {
            if (ele == a[i])
                return "Element is found at index is : " + i;
        }
        return "Element is not found";
    }
}
