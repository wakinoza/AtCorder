import java.util.*;

//ABC412B
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sArray = scanner.next().split("");
        String[] tArray = scanner.next().split("");
        Set<String> tArraySet = new HashSet<>(Arrays.asList(tArray)); 
        scanner.close();

        for (int i = 1; i < sArray.length; i++) {
          if (sArray[i].matches("[A-Z]+") && !tArraySet.contains(sArray[i - 1])) {
            System.out.println("No");
            return;
          }
        }
        System.out.println("Yes");
    }
}   
