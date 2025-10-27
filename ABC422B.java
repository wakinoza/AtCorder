import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        boolean[][] isBlackGrids = new boolean[h][w];
        for (int i = 0; i < h; i++) {
          String[] line = scanner.next().split(""); 
          for (int j = 0; j < w; j++) {
            if (line[j].equals("#")) {
              isBlackGrids [i][j] = true;
            } else {
              isBlackGrids [i][j] = false;
            }
          }
        }
        scanner.close();
        
        for (int i = 0; i < h; i++) {
          for (int j = 0; j < w; j++) {
            if (!isBlackGrids[i][j]) {
              continue;
            }
            int blackTotal = 0;
            if (i >= 1 && isBlackGrids[i - 1][j]) {
              blackTotal++;
            }
            if (j >= 1 && isBlackGrids[i][j - 1]) {
              blackTotal++;
            }
            if (i < h - 1 && isBlackGrids[i + 1][j]) {
              blackTotal++;
            }
            if (j < w - 1 && isBlackGrids[i][j + 1]) {
              blackTotal++;
            }

            if (blackTotal == 0 || blackTotal == 1 || blackTotal == 3) {
              System.out.println("No");
              return;
            }
          }
        }
        System.out.println("Yes");
    }
} 
