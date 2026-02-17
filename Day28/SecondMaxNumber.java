package Day28;

public class SecondMaxNumber {
    public static void main(String[] args) {

        int[] a = { 100, 30, 20, 50, 40, 5, 45 };
        int max = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;

        for (int i = 1; i < a.length; i++) {
            if (max > a[i]) {
                SecondMax = max;
                max = a[i];
            } else if (SecondMax < a[i] && a[i]!= max) {
                SecondMax = a[i];
            }
        }
        System.out.println("Second Maximum Number is : " + SecondMax);

    }
}
