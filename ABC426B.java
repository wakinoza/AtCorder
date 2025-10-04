import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();
        String initial = s.substring(0,1);
        String withoutInitial = s.replaceAll(initial,"");
        if (withoutInitial.length() == 1){
          System.out.println(withoutInitial);
        } else {
          System.out.println(initial);
        }
    }
} 