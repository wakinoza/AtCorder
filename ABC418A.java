import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        scanner.close();
        if (s.endsWith("tea")) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    }
}
