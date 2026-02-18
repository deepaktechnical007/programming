package Day31;

public class FindTheMissingArray {
    public static void main(String[] args) {
;
        int[] arr = { 1, 2, 3, 4, 6 };
        int sum = 0;
        int n = arr.length + 1;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int expectedSum = n * (n + 1) / 2;
        int missingNumber = expectedSum - sum;
        System.out.println("The missing number is: " + missingNumber);
    }

}
