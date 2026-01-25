package Day12;

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    for (int num = 1; num <= 100; num++) {
      int count = 0;
      for (int i = 2; i <= num; i++) {
        if (num % i == 0) {
          if (i == num) {
            System.out.print(num+" " );
          }
          if(count==2){
            System.out.println(count);
          }
        }
      }

    }
  }

}