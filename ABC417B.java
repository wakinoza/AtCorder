
import java.util.*;
import java.util.stream.Collectors;

//ABC417B
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n ;i++) {
          numbers.add(scanner.nextInt());
        }
        for (int i = 0; i < m ;i++) {
          int currentNumber = scanner.nextInt();
          if (numbers.contains(currentNumber)) {
            numbers.remove(numbers.indexOf(currentNumber));
          }
        }
        scanner.close();
        System.out.println(numbers.stream()
          .map(String::valueOf) 
          .collect(Collectors.joining(" ")) 
          );
    }
}