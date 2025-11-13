
import java.util.*;

//ABC417A

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String s = scanner.next();
        scanner.close();
        System.out.println(s.substring(a, n - b));
    }
}