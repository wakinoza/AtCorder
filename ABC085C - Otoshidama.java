import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        final int TEN_THOUSAND = 10_000;
        final int FIVE_THOUSAND = 5_000;
        final int THOUSAND = 1000;

        for (int i = 0; i <= n; i++) {
          for (int j = 0; j <= (n - i); j++) {
            int k = n - i - j;
            if (i * TEN_THOUSAND + j * FIVE_THOUSAND + k * THOUSAND == y) {
              System.out.println(i + " " + j + " " + k);
              return;
            }
          }
        }
        System.out.println("-1 -1 -1");
    }
} 
