import java.util.*;

//ABC410C
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
          numbers[i] = i + 1;
        }
        int headIndex = 0;
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
          int query = scanner.nextInt();
          if (query == 1) {
            int p = scanner.nextInt();
            int x = scanner.nextInt();
            int actualIndex = (headIndex + (p - 1)) % n;
            numbers[actualIndex] = x;
          } else if (query == 2) {
            int p = scanner.nextInt();
            int actualIndex = (headIndex + (p - 1)) % n;
            System.out.println(numbers[actualIndex]);
          } else {
            long k = scanner.nextLong();
            int repeatNumber = (int) (k % n);
            headIndex = (headIndex + repeatNumber) % n;
          }
        }
        scanner.close();
    }
}   
