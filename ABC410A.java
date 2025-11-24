import java.util.*;

//ABC410A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] limitedAges = new int[n];
        for (int i = 0; i < n; i++) {
          limitedAges[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        scanner.close();
        int answer = 0;
        for (int age : limitedAges)  {
          if (age >= k) {
            answer++;
          }
        }
        System.out.println(answer);
    }
}   
