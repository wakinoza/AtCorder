import java.util.*;

//ABC394A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        scanner.close();
        
        if (s1.equals("fine") && s2.equals("fine") ) {
          System.out.println(4);
        } else if (s1.equals("fine") && s2.equals("sick") ) {
          System.out.println(3);
        } else if (s1.equals("sick") && s2.equals("fine") ) {
          System.out.println(2);
        } else {
          System.out.println(1);
        }
    }
}   
