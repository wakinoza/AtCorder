import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int inputsTotal = 0;
        List<Integer> inputs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            inputs.add(input);
            inputsTotal += input;
        }
        scanner.close();

        int diff = inputsTotal - m;
        
        if (inputs.contains(diff)) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    }
} 
