import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] inputs = new int[n + 1];
        boolean[] isUsedNumber = new boolean[n + 1];
        Arrays.fill(isUsedNumber,false);

        for (int i = 1; i <= n; i++) {
          int current = scanner.nextInt();
          inputs[i] = current;
          if (current > 0) {
            if(isUsedNumber[current]) {
              System.out.println("No");
              return;
            } else {
              isUsedNumber[current] = true;
            }
          }
        }
        scanner.close();

        List<Integer> unUsedNumbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
          if (!isUsedNumber[i]) {
            unUsedNumbers.add(i);
          }
        }

        System.out.println("Yes");
        int index = 0;
        for (int i = 1; i <= n; i++) {
          if (i > 1) {
            System.out.print(" ");
          }
          if (inputs[i] == -1) {
            System.out.print(unUsedNumbers.get(index));
            index++;
          } else {
            System.out.print(inputs[i]);
          }
        }
        System.out.println("");
    }
} 
