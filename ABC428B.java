import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String s = scanner.next();
        scanner.close();

        Map<String, Integer> subStrings = new TreeMap<>();

        for (int i = 0; i <= n - k; i++) {
          String substringK = s.substring(i, i + k);
          subStrings.put(substringK, subStrings.getOrDefault(substringK, 0) + 1);
        }

        int maxCount = 0;
        for (Integer val : subStrings.values()){
          maxCount = Math.max(maxCount, val);
        }

        System.out.println(maxCount);
        int count = 0;
        for(Map.Entry<String, Integer> entry : subStrings.entrySet()){
          if (entry.getValue() == maxCount) {
            if (count == 0) {
              System.out.print(entry.getKey());
            } else {
              System.out.print(" " + entry.getKey());
            }
            count++;
          }
		    }
        System.out.println("");
    }
} 
