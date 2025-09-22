import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();

        int count = 0;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                int sum = 500 * i + 100 * j;
                
                if (sum > x) {
                    break;
                }
                
                int remaining = x - sum;
                
                if (remaining % 50 == 0 && remaining / 50 <= c) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}