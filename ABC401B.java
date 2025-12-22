import java.util.*;

//ABC401B
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean isLogin = false;
        int errorCount = 0;
        for (int i = 0; i < n; i++) {
          String s = scanner.next();
          if (s.equals("login")) {
            isLogin = true;
          } else if (s.equals("logout")) {
            isLogin = false;
          } else if (s.equals("private")) {
            if(!isLogin) {
              errorCount++;
            }
          } 
        }
        scanner.close();
        System.out.println(errorCount);
    }
}   
