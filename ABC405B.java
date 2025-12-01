import java.util.*;

//ABC405B
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Integer> countHash = new HashMap<>();
        for (int i = 1; i <= m; i++) {
          countHash.put(i,0);
        }
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
          int current = scanner.nextInt();
          numbers[i] = current;
          countHash.replace(current, countHash.get(current) + 1);
        }
        scanner.close();
        
        for (Integer val : countHash.values()){
          if (val == 0) {
            System.out.println(0);
            return;
          }
        }
        int removeCount = 0;
        for (int i = n - 1; i >= 0; i--) {
          removeCount++;
          int removeNumber = numbers[i];
          countHash.replace(removeNumber, countHash.get(removeNumber) - 1);
          if (countHash.get(removeNumber) == 0) {
            System.out.println(removeCount);
            return ;
          }
        }
        System.out.println(removeCount);
    }
}   
