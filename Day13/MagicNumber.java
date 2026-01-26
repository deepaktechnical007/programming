package Day13;

public class MagicNumber {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is a Magic Number.");
        } else {
            System.out.println(number + " is not a Magic Number.");
        }

        scanner.close();
    }
}
