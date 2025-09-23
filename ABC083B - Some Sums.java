import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        scanner.close();

        List<Integer> sums = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
          int currentI = i;
          int tenThousand = currentI / 10000;
          currentI = currentI % 10000;
          int thousand = currentI / 1000;
          currentI = currentI % 1000;
          int hundred = currentI / 100;
          currentI = currentI % 100;
          int ten = currentI / 10;
          int one = currentI % 10;
          int sum = tenThousand + thousand + hundred + ten + one;
          if (sum >= a && sum <= b) {
            sums.add(i);
          }
        }

        int answer = 0;
        for (Integer sum : sums) {
          answer += sum;
        }
        System.out.println(answer);
    }
} 
