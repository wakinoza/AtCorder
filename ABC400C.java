import java.util.*;

//ABC400C
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();

        long goodNumberTotal = 0;
        long powerOf2 = 2;
        while (powerOf2 <= n) {
            long maxB = n / powerOf2;
            long k = (long) Math.sqrt(maxB);

            if ((k + 1) * (k + 1) <= maxB) k++;
            if (k * k > maxB) k--;

            goodNumberTotal += (k + 1) / 2;
            if (n / 2 < powerOf2) {
              break; 
            } else {
              powerOf2 *= 2;
            }
        }
        System.out.println(goodNumberTotal);
    }
}   
