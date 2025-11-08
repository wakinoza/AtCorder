import java.util.*;

public class ABC431C {

  public static void main(String[] var0) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      int k = scanner.nextInt();
      int[] headWeights = new int[n];

      for(int i = 0; i < n; ++i) {
        headWeights[i] = scanner.nextInt();
      }
      Arrays.sort(headWeights);
      int[] bodyWeights = new int[m];

      for(int i = 0; i < m; ++i) {
        bodyWeights[i] = scanner.nextInt();
      }
      Arrays.sort(bodyWeights);
      scanner.close();

      int robotTotal = 0;
      int headIndex = 0;
      int bodyIndex = 0;

      while(robotTotal < k && headIndex < n && bodyIndex < m) {
        if (headWeights[headIndex] <= bodyWeights[bodyIndex]) {
            robotTotal++;
            headIndex++;
            bodyIndex++;
        } else {
            while(bodyIndex < m && headWeights[headIndex] > bodyWeights[bodyIndex]) {
              bodyIndex++;
            }
            if (bodyIndex < m && headWeights[headIndex] <= bodyWeights[bodyIndex]) {
              robotTotal++;
              headIndex++;
              bodyIndex++;
            } else {
              break;
            }
        }
      }

      if (robotTotal  >= k) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
  }
}
