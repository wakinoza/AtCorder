import java.util.*;
import java.util.stream.Collectors;

//ABC398C
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> indexHash = new HashMap<>();
        Map<Integer, Integer> countHash = new HashMap<>();
        for (int i = 1; i <= n; i++) {
          int a = scanner.nextInt();
          countHash.put(a, countHash.getOrDefault(a, 0) + 1);
          if (!indexHash.containsKey(a)) {
            indexHash.put(a, i);
          } 
        }
        scanner.close();

        int maxUniqueValue = -1;
        int answerPerson = -1;


        for (Map.Entry<Integer, Integer> entry : countHash.entrySet()) {
            if (entry.getValue() == 1) {
                int value = entry.getKey();
                if (value > maxUniqueValue) {
                    maxUniqueValue = value;
                    answerPerson = indexHash.get(value);
                }
            }
        }

        System.out.println(answerPerson);

    }
}   

