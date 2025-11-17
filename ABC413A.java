
import java.util.*;

//ABC413A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < n; i++) {
          total += scanner.nextInt();
        }
        scanner.close();
        if (total > m) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }
}   
