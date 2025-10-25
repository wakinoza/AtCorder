import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n; i++) {
          if (i <= m) {
            System.out.println("OK");
          }else {
            System.out.println("Too Many Requests");
          }
        }
    }
} 