import java.util.*;

//ABC405C
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        long total = 0L;
        long cumulativeSum = 0L;
        numbers[0] = scanner.nextInt();
        cumulativeSum += numbers[0];
        for (int i = 1; i < n; i ++) {
          int current = scanner.nextInt();
          numbers[i] = current;
          total += cumulativeSum * current; 
          cumulativeSum += current;
        }
        scanner.close();
        
        System.out.println(total);
    }
}   

