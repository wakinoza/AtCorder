
import java.util.*;

//ABC414B
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        long sbLength = 0;
        for (int i = 0; i < n; i++) {
          String c = scanner.next();
          long l = scanner.nextLong();
          sbLength += l;
          if (sbLength > 100) {
            System.out.println("Too Long");
            return;
          }
          for (int j = 0; j < l; j++) {
            sb.append(c);
          }
        }
        scanner.close();
        System.out.println(sb.toString());
    }
}   

