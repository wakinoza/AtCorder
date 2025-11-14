import java.util.*;

//ABC416A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt() - 1;
        int r = scanner.nextInt() - 1;
        char[] sArray = scanner.next().toCharArray();
        scanner.close();
        for (int i = l; i <= r; i++) {
          if (sArray[i] == 'x') {
            System.out.println("No");
            return;
          }
        }
        System.out.println("Yes");

    }
} 