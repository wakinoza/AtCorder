import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        if (c >= a) {
          if (d < b) {
            System.out.println("Yes");
            return;
          }
        }
        System.out.println("No");
    }
}  