import java.util.*;

//ABC416B
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        if (!s.contains(".")) {
          System.out.println(s);
          return;
        }
        if (!s.contains("#")) {
          System.out.println("o" + s.substring(1));
          return;
        }

        char[] sArray = s.toCharArray();
        StringBuilder answer = new StringBuilder();
        boolean hasSharp = false;
        boolean isFirstMark = true;
        for (char c : sArray) {
          if (c == '#') {
            answer.append("#");
            hasSharp = true;
          } else {
            if (isFirstMark) {
              answer.append("o");
              isFirstMark = false;
              hasSharp = false;
            } else if (!isFirstMark && hasSharp){
              answer.append("o");
              hasSharp = false;
            } else {
              answer.append(".");
            }
          }
        }
        System.out.println(answer.toString());
    }
}   

