import java.util.*;

import java.util.*;

//ABC406B
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long limit = 1;
        for (int i = 0; i < k; i++) {
            limit *= 10;
        }
        long current = 1L;
        for (int i = 0; i < n; i++) {
          long a = scanner.nextLong();
          if (Long.MAX_VALUE / current < a) {
            current = 1L;
          } else {
            long nextVal = current * a;
            if (nextVal >= limit) {
                current = 1L;
            } else {
                current = nextVal;
            }
          }
        }
        scanner.close();
        System.out.println(current);
    }
}   


// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int k = scanner.nextInt();

//         long limit = 1;
//         for (int i = 0; i < k; i++) {
//             limit *= 10;
//         }

//         long current = 1L;
//         for (int i = 0; i < n; i++) {
//             long a = scanner.nextLong();
 
//             if (current * a >= limit) { 
//                 current = 1L;
//             } else {
//                 long nextVal = current * a;
//                 if (nextVal >= limit) {
//                     current = 1L;
//                 } else {
//                     current = nextVal;
//                 }
//             }
//         }
//         scanner.close();
//         System.out.println(current);
//     }
// }