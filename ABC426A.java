import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> versions = new HashMap<>();
        versions.put( "Ocelot", 1);
        versions.put( "Serval", 2);
        versions.put( "Lynx", 3);
        String x = scanner.next();
        String y = scanner.next();
        scanner.close();

        int xIndex = versions.get(x);
        int yIndex = versions.get(y);

        if (xIndex >= yIndex) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    }
} 
