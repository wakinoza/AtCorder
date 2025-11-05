import java.util.*;

public class ABC420B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char [][] votes = new char[m][n];
        for (int i = 0; i < n; i++) {
          char[] line = scanner.next().toCharArray();
          for (int j = 0; j < m; j++) {
            votes[j][i] = line[j];
          }
        }
        scanner.close();
        Map<Integer, Integer> pointCounts = new TreeMap<>();
        for (int i = 1; i <= n ;i++) {
          pointCounts.put(i,0);
        }
        int halfN = n / 2;
        for (char[] lineChars : votes) {
          int total0 = 0;
          for (char number :lineChars) {
            if (number == '0') {
              total0++;
            }
          }
          if (total0 <= halfN) {
            for (int i = 0; i < n; i++) {
              if (lineChars[i] == '0') {
                pointCounts.replace(i + 1, pointCounts.get(i + 1) + 1);
              }
            }
          } else {
            for (int i = 0; i < n; i++) {
              if (lineChars[i] == '1') {
                pointCounts.replace(i + 1, pointCounts.get(i + 1) + 1);
            }
            }
          }
        }
        int maxValue = 0;
        for (Integer val : pointCounts.values()) {
          if (val > maxValue) {
            maxValue = val;
          }
        }
        List<Integer> answer = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : pointCounts.entrySet()){
          if (entry.getValue() == maxValue) {
            answer.add(entry.getKey());
          }
		    }
        for (int i = 0;i < answer.size() ;i++) {
          if (i == 0) {
            System.out.print(answer.get(i));
          } else {
            System.out.print(" " + answer.get(i));
          }
        }
        System.out.println("");
	  }
} 
