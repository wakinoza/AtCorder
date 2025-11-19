import java.util.*;

//ABC412A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int taskOverDayTotal = 0;
        for (int i = 0; i < n; i ++) {
          int a = scanner.nextInt();
          int b = scanner.nextInt();
          if (a < b) {
            taskOverDayTotal++;
          }
        }
        scanner.close();
        System.out.println(taskOverDayTotal);

    }
}   
