import java.util.*;

public class ABC431A {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        int difference = h - b;
        if (difference > 0) {
          System.out.println(difference);
        } else {
          System.out.println(0);
        }
    }
} 
