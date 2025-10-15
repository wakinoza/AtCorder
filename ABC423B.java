import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] isOpens = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (scanner.nextInt() == 0){
                isOpens[i] = true;
            } else {
              isOpens[i] = false;
            }
        }
        scanner.close();

        int cannotEnterTotal = n - 1;
        for (int i = 0; i < n; i++) {
          if (isOpens[i]) {
            cannotEnterTotal--;
          } else {
            break;
          }
        }
        if (cannotEnterTotal != 0) {
          for (int i = n - 1; i >= 0; i--) {
              if (isOpens[i]) {
                cannotEnterTotal--;
              } else {
                break;
              }
          }
        }
        if (cannotEnterTotal <= 0) {
          System.out.println(0);
        } else {
          System.out.println(cannotEnterTotal);
        }

    }
} 