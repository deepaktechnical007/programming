package Day11;

public class PrimeNumber {

    public static void main(String[] args) {

        PrimeNumber primeNumber = new PrimeNumber();
        int numberToCheck = 29; // You can change this number to test other values
        primeNumber.checkPrime(numberToCheck);
    }
    public void checkPrime(int num) {

        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}