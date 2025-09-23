import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] inputs = new int[n];
        for (int i = 0; i < n ; i++) {
          inputs[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(inputs);

        int aliceSum = 0;
        int bobSum = 0;

        for (int i = n-1; i >= 0; i -= 2) {
          aliceSum += inputs[i];
          if (i - 1 >= 0) {
            bobSum += inputs[i - 1];
          }
        }
        System.out.println(aliceSum - bobSum);
    }
} 