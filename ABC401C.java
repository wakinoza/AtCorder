import java.util.*;

//ABC401C
public class Main {
    public static void main(String[] args) {
        final long UPPER_LIMIT = 1000000000L;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        long[] aArray = new long[n + 1];
        for (int i = 0; i <= n; i++) {
          if (i < k) {
            aArray[i] = 1L;
          } else if (i == k) {
            aArray[i] = k; 
          } else {
            long nextA = 2 * aArray[i - 1] - aArray[i - k - 1];
            aArray[i] = (nextA + UPPER_LIMIT) % UPPER_LIMIT;
          }
        }
        System.out.println(aArray[n]);
    }
}   

