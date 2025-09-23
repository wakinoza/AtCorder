import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> inputs = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
          inputs.add(scanner.nextInt());
        }
        scanner.close();

        System.out.println(inputs.size());
    }
} 
