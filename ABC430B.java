import java.util.*;

public class Main {

    static String getSmallGridsString(String[][] largeGrids, int x,int y, int m) {
        StringBuilder answer = new StringBuilder();
        for (int i = x; i < x + m; i++) {
          for(int j = y; j < y + m; j++) {
            answer.append(largeGrids[i][j]);
          }
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[][] largeGrids = new String[n][n];
        for (int i = 0; i < n; i++) {
          String[] lines = scanner.next().split("");
          for (int j = 0; j < n; j++) {
            largeGrids[i][j] = lines[j];
          }
        }
        scanner.close();

        Set<String> smallGrids = new HashSet<>();

        for (int i = 0; i <= n - m; i++) {
          for(int j = 0; j <= n - m; j++) {
            smallGrids.add(getSmallGridsString(largeGrids, i, j, m));
          }
        }
        System.out.println(smallGrids.size());
    }
} 