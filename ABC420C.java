import java.util.*;

//ABC420C
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int[] aArrays = new int[n + 1];
        for (int i = 1; i <= n; i++) {
          aArrays[i] = scanner.nextInt();
        }
        int[] bArrays = new int[n + 1];
        long sumOfMinAB = 0L;
        for (int i = 1; i <= n; i++) {
          int currentB = scanner.nextInt();
          bArrays[i] = currentB;
          sumOfMinAB += Math.min(aArrays[i], currentB);
        }
        for (int i = 0; i < q; i++) {
          String c = scanner.next();
          int x = scanner.nextInt();
          int v = scanner.nextInt();
          
          int prevIndexXMin = Math.min(aArrays[x], bArrays[x]);
          if (c.equals("A")) {
            aArrays[x] = v;
            int currentIndexXMin = Math.min(v, bArrays[x]);
            sumOfMinAB = sumOfMinAB - prevIndexXMin + currentIndexXMin;
            System.out.println(sumOfMinAB);
          } else {
            bArrays[x] = v;
            int currentIndexXMin = Math.min(v, aArrays[x]);
            sumOfMinAB = sumOfMinAB - prevIndexXMin + currentIndexXMin;
            System.out.println(sumOfMinAB);
          }
        }
        scanner.close();
    }
} 
