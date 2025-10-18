import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();
        
        int[] footSteps = new int [x + a + b + 1];
        footSteps[0] = 0;
        int currentMinute = 0;
        while (currentMinute < x) {
          for (int i = 1; i <= a; i++) {
            currentMinute++;
            footSteps[currentMinute] = footSteps[currentMinute - 1] + s;
          }
          for (int i = 1; i <= b; i++) {
            currentMinute++;
            footSteps[currentMinute] = footSteps[currentMinute - 1];
          }
        }
        System.out.println(footSteps[x]);
    }
} 