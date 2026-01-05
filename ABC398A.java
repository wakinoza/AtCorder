import java.util.*;

//ABC398A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        String answer;
        if (n % 2 == 0) {
          answer = "-".repeat(n / 2 - 1) + "==" + "-".repeat(n / 2 - 1);
        } else {
          answer = "-".repeat((n + 1)/ 2 - 1) + "=" + "-".repeat((n + 1)/ 2 - 1);
        }
        System.out.println(answer);
    }
}   
