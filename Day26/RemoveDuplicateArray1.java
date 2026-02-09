package Day26;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicateArray1 {
    public static void main(String[] args) {
        int[] a = { 10, 20, 10, 30, 40, 20, 50 };

        System.out.println(removeDuplicates(a));
    }

    public static HashSet<Integer> removeDuplicates(int[] a) {
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int ele : a) {
            hashSet.add(ele);
        }
        return hashSet;
    }
}
