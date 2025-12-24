import java.util.*;

//ABC400B
public class Main {
    public static void main(String[] args) {
        final long UPPER_LIMIT = 1000000000L; 
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        long sum = 1;
        for (int i = 1; i <= m; i++) {
          sum += Math.pow(n, i);
          if (sum > UPPER_LIMIT) {
            System.out.println("inf");
            return;
          }
        }
        System.out.println(sum);
    }
}   