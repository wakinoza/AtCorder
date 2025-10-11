import java.util.*;

public class Main {

  static int getDigitSum(int n) {

    List<Integer> digits = new ArrayList<>();
    int currentN = n;

    while(currentN >= 10) {
      digits.add(currentN % 10);
      currentN = currentN / 10;
    }
    digits.add(currentN);

    int answer = 0;
    for (Integer digit :digits) {
      answer += digit;
    }
    return answer;
  }


  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int[] a = new int [n + 1];
        a[0] = 1;
        int answer = 0;
        for (int i = 0; i < n; i++) {
          answer += getDigitSum(a[i]);
          a[i + 1] = answer;
        }
        System.out.println(answer);
    }
} 