import java.util.*;

public class ABC431B {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int[] partsWeights = new int[n];
        boolean[] hasParts = new boolean[n];
        for (int i = 0; i < n; i++) {
          partsWeights[i] = scanner.nextInt();
          hasParts[i] = false;
        }

        int q = scanner.nextInt();
        int currentWeight = x;
        for (int i = 0; i < q; i++) {
          int query = scanner.nextInt() - 1;
          if (hasParts[query]) {
            hasParts[query] = false;
            currentWeight -= partsWeights[query];
            System.out.println(currentWeight);
          } else {
            hasParts[query] = true;
            currentWeight += partsWeights[query];
            System.out.println(currentWeight);
          }
        }
        scanner.close();
    }
} 

