import java.util.*;

//ABC405A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();
        if (x == 1) {
          if (r >= 1600 && r <= 2999) {
            System.out.println("Yes");
          } else {
            System.out.println("No");
          }
        } else {
          if (r >=1200 && r <= 2399) {
            System.out.println("Yes");
          } else {
            System.out.println("No");
          }
        }
    }
}   
