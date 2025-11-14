import java.util.*;

//ABC
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> inputs  = new ArrayList<>():
        for (int i = 0; i < n; i++) {
          inputs.add(scanner.nextInt());
        }
        int x = scanner.nextInt();
        if (inputs.contains(x)) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    }
}   

