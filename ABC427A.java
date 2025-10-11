import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        
        scanner.close();

        int centerIndex = (s.length() + 1) / 2;
        System.out.println(s.substring(0,centerIndex - 1) + s.substring(centerIndex));
    }
} 
