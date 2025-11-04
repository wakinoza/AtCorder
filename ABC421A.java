import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] names = new String[n + 1];
        for (int i = 1; i <= n; i++) {
          names[i] = scanner.next();
        }
        int x = scanner.nextInt();
        String y = scanner.next();
        scanner.close();

        if (names[x].equals(y)) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    }
} 