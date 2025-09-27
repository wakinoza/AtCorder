import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int answer = 0;
        for (int i = 1; i <= n; i++) {
          if (i % 2 == 0) {
            answer += Math.pow(i, 3);
          } else {
            answer -= Math.pow(i, 3);
          }
          
        }

        System.out.println(answer);
    }
} 