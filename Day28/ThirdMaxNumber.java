package Day28;

public class ThirdMaxNumber {
    public static void main(String[] args) {

        int[] a = { 100, 30, 20, 50, 40, 5, 45 };
        int max = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;
        int ThirdMax = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                ThirdMax = SecondMax;
                SecondMax = max;
                max = a[i];
            } else if (a[i] > SecondMax && a[i] != max) {
                ThirdMax = SecondMax;
                SecondMax = a[i];
            } else if (a[i] > ThirdMax && a[i] != SecondMax && a[i] != max) {
                ThirdMax = a[i];
            }
        }
        System.out.println("Third Maximum Number is : " + ThirdMax);
    }
}
