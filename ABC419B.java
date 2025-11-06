import java.util.*;

public class ABC419B {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        Queue<Integer> queue = new PriorityQueue<Integer>();
        for (int i = 0; i < q; i++) {
          int initialNumber = scanner.nextInt();
          if (initialNumber == 1) {
            int addNumber = scanner.nextInt();
            queue.add(addNumber);
          } else {
            System.out.println(queue.poll());
          }
        }
        scanner.close();
    }
} 


