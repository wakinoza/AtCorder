import java.util.*;

//ABC411A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.next();
        int l = scanner.nextInt();
        scanner.close();
        if (p.length() >= l) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }

    }
}   

