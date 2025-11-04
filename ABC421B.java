import java.util.*;

public class Main {
    static long getReverseInt(long n) {
      char[] nChars = String.valueOf(n).toCharArray();
      StringBuilder sb = new StringBuilder();
      for (char c : nChars) {
        sb.append(c);
      }
      sb.reverse();
      String reverse = sb.toString();
      return Long.parseLong(reverse);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        long[] fibonacciArray = new long[11];

        fibonacciArray[1] = x;
        fibonacciArray[2] = y;
        for (int i = 3; i <= 10; i++) {
          fibonacciArray[i] = getReverseInt(fibonacciArray[i - 2] + fibonacciArray[i - 1]);
        }

        System.out.println(fibonacciArray[10]);
    }
}