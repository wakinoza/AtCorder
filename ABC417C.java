import java.util.*;

//ABC417C
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] numbers = new int[n + 1];
        Map <Integer, Integer> hashmap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
          int current = scanner.nextInt();
          numbers[i] = current;
          int indexPlusValue = i + current;
          hashmap.put(indexPlusValue, hashmap.getOrDefault(indexPlusValue, 0) + 1);
        }
        scanner.close();
        long total = 0L;
        for (int i = 1; i <= n; i++) {
          int checkNumber = i - numbers[i];
          if (checkNumber > 1) {
            total += hashmap.getOrDefault(checkNumber, 0);
          }
        }
        System.out.println(total);
    }
} 
