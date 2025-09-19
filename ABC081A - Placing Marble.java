import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        
        int total1 = 0;
        for (int i = 0;i < 3; i++) {
          char currentChar = s.charAt(i);
          if (currentChar == '1') {
            total1++;
          }
        }
        System.out.println(total1);
        
        scanner.close();
    }
} 