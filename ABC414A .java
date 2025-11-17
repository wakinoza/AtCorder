
import java.util.*;

//ABC414A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        
        int viewerTotal = 0;
        for (int i = 0; i < n; i++) {
          int x = scanner.nextInt();
          int y = scanner.nextInt();
          if (x <= l && r <= y) {
            viewerTotal++;
          }
        }
        scanner.close();
        System.out.println(viewerTotal);

    }
}   

