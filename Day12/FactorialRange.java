package Day12;

public class FactorialRange {

    public static void main(String[] args) {

        for (int i = 2; i <= 6; i++) {
            int temp = 1;

            for (int j = i; j >= 1; j--) {
                temp *= j;

            }
            System.out.println(i+"! -----> "+ temp);

        }
    }
}
