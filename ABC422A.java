import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArray = scanner.next().split("");
        scanner.close();
        if (stringArray[2].equals("8")) {
          int nextWorld = Integer.parseInt(stringArray[0]) + 1;
          System.out.println(nextWorld + "-1");
        } else {
          int nextStage = Integer.parseInt(stringArray[2]) + 1;
          System.out.println(stringArray[0] + "-" + nextStage);
        }
    }
} 