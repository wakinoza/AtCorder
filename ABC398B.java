import java.util.*;

//ABC398B
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberCount = new int[14];
        Arrays.fill(numberCount,0);
        for (int i = 0; i < 7; i++) {
          int a = scanner.nextInt();
          numberCount[a]++;
        }
        scanner.close();

        int treeOverCount = 0;
        int twoCount = 0;
        for (int i = 1; i < 14; i++) {
          if (numberCount[i] >= 3) {
            treeOverCount++;
          } else if (numberCount[i] == 2) {
            twoCount++;
          }
        }
        if (treeOverCount >= 2 || (treeOverCount >= 1 && twoCount >= 1)) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    }
}   
