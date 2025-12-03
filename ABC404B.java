import java.util.*;

//ABC404B
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[][] sGrids = new boolean[n][n];
        for (int i = 0; i < n; i++) {
          char[] sArray = scanner.next().toCharArray();
          for (int j = 0; j < n; j++) {
            if (sArray[j] == '#') {
              sGrids[i][j] = true;
            } else {
              sGrids[i][j] = false;
            }
          }
        }

        int mismatch0 = 0;
        int mismatch90 = 1;
        int mismatch180 = 2;
        int mismatch270 = 3;
        for (int i = 0; i < n; i++) {
          char[] tArray = scanner.next().toCharArray();
          for (int j = 0; j < n; j++) {
            if (tArray[j] == '#') {
              if (!sGrids[i][j]) {
                mismatch0++;
              } 
              if (!sGrids[n - j - 1][i]) {
                mismatch90++;
              }
              if (!sGrids[n - i - 1][n - j - 1]) {
                mismatch180++;
              }
              if (!sGrids[j][n - i - 1]) {
                mismatch270++;
              }
            } else {
              if (sGrids[i][j]) {
                mismatch0++;
              } 
              if (sGrids[n - j - 1][i]) {
                mismatch90++;
              }
              if (sGrids[n - i - 1][n - j - 1]) {
                mismatch180++;
              }
              if (sGrids[j][n - i - 1]) {
                mismatch270++;
              }
            }
          }
        }
        scanner.close();
        int answer = Math.min(Math.min(mismatch0, mismatch90), Math.min(mismatch180, mismatch270));
        System.out.println(answer);
    }
}   

