import java.util.*;
//ABC432B
public class ABC432B {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        char[] xCharArray = String.valueOf(x).toCharArray();
        scanner.close(); 
        List<Character> over1 = new ArrayList<>();
        List<Character> number0 = new ArrayList<>();
        for (char c : xCharArray) {
          if (c == ('0')) {
            number0.add('0');
          } else {
            over1.add(c);
          }
        }
        Collections.sort(over1);
        System.out.print(over1.get(0));
        for (char zero : number0) {
          System.out.print(zero);
        }
        for (int i = 1; i < over1.size(); i++) {
          System.out.print(over1.get(i));
        }
        System.out.println("");
    }
}   
