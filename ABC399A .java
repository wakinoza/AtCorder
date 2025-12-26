import java.util.*;

//ABC399A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] sArray = scanner.next().toCharArray();
        char[] tArray = scanner.next().toCharArray();
        scanner.close();
        int hammingTotal = 0;
        for (int i = 0; i < n; i++) {
          if (sArray[i] != tArray[i]) {
            hammingTotal++;
          }
        }
        System.out.println(hammingTotal);
    }
}   

