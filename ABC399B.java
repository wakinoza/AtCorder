import java.util.*;

//ABC399B
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] scores = new int[n + 1];
        Set<Integer> descendingScoreSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 1; i <= n; i++) {
          int score = scanner.nextInt();
          scores[i] = score;
          descendingScoreSet.add(score);
        }
        scanner.close();
        int[] rankings = new int[n + 1];
        int currentR = 1;
        for (Integer nextRankScore : descendingScoreSet) {
          int thisRankTotal = 0;
          for (int i = 1; i <= n; i++) {
            if (scores[i] == nextRankScore) {
              thisRankTotal++;
              rankings[i] = currentR;
            }
          }
          currentR += thisRankTotal;
        }
        for (int i = 1; i <= n; i++ ) {
            System.out.println(rankings[i]);
        }
    }
}   