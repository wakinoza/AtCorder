import java.util.*;
import java.util.stream.Collectors;

//ABC411B
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int distanceSum = 0;
        int[] distanceCumulativeSum = new int[n];
        for (int i = 1; i < n; i++) {
          distanceSum += scanner.nextInt();
          distanceCumulativeSum[i] = distanceSum;
        }
        scanner.close();

        for (int i = 1; i < n ; i++) {
          List<Integer> cumulativeSums = new ArrayList<>();
          for (int j = i ; j < n; j++) {
            if (i == 1) {
              cumulativeSums.add(distanceCumulativeSum[j]);
            } else {
              int currentSum = distanceCumulativeSum[j] - distanceCumulativeSum[i - 1];
              cumulativeSums.add(currentSum);
            }
          }
          String result = cumulativeSums.stream()
              .map(String::valueOf) 
              .collect(Collectors.joining(" "));
          System.out.println(result);
        }
    }
}   

