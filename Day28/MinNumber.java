package Day28;

public class MinNumber {
    public static void main(String[] args) {

        int[] a = { 10, 20, 30, 40, 5, 70, 15 };

        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Minimum number is : " + min);
    }
}
