package Day31;

public class Program {
    public static void main(String[] args) {

        int[] arr = { 3, 7, 2, 5, 4, 1, 10, 9, 8, 4, 1 };
        int P = 0;
        int S = 0;
        for (int i = 0; i < arr.length; i += 4) {

            if (i + 2 < arr.length) {
                P += arr[i] * arr[i + 2];
            }
        }
        System.out.println("P : " + P);
        for (int i = 1; i < arr.length; i += 4) {
            if (i + 2 < arr.length) {
                S += arr[i] - arr[i + 2];
            } else {
                S += arr[i];
            }
        }
        System.out.println("S : " + S);
        int X = P - S;
        System.out.println("X : " + X);
        int Y = 0;
        while (X > 0) {
            Y += X % 10;
            X /= 10;
        }
        System.out.println("Y : " + Y);
    }
}
