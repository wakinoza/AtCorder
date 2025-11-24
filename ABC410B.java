import java.util.*;
import java.util.stream.Collectors;

//ABC410B
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int[] boxes = new int[n + 1];
        Arrays.fill(boxes,0);
        Map<Integer, Integer> bollCountHash = new HashMap<>();
        bollCountHash.put(0,n);
        List<Integer> answers = new ArrayList<>(); 
        for (int i = 0; i < q; i++) {
          int b = scanner.nextInt();
          if (b > 0) {
            answers.add(b);
            int prevCount = boxes[b];
            boxes[b] = prevCount + 1;
            bollCountHash.replace(prevCount, bollCountHash.get(prevCount) - 1);
            bollCountHash.put(boxes[b], bollCountHash.getOrDefault(boxes[b], 0) + 1);
          } else {
            int minCount = 0;
            while (bollCountHash.get(minCount) == 0) {
              minCount++;
            }
            for (int j = 1; j <= n; j++) {
              if (boxes[j] == minCount) {
                answers.add(j);
                int prevCount = boxes[j];
                boxes[j] = prevCount + 1;
                bollCountHash.replace(prevCount, bollCountHash.get(prevCount) - 1);
                bollCountHash.put(boxes[j], bollCountHash.getOrDefault(boxes[j], 0) + 1);
                break;
              }
            }
          }
        }
        scanner.close();
        String result = answers.stream()
          .map(String::valueOf) //
          .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}   

