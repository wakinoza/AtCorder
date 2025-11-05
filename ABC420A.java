import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        int sum = x  + y;
        if (sum == 24) {
          System.out.println(12);
        } else if (sum > 12) {
          System.out.println(sum % 12);
        } else {
          System.out.println(sum);
        }
    }
} 
