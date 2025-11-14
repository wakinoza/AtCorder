import java.util.*;

//ABC
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] sArray = scanner.next().toCharArray();
        scanner.close();
        int sLength = sArray.length;
        int currentIndex = 0;
        while (currentIndex < sLength) {
          int firstLuggageIndex = 0;
          int secondLuggageIndex = 0;
          for (int i = currentIndex; i < sLength; i++) {
            if (sArray[i] == '#') {
              firstLuggageIndex = i + 1;
              currentIndex++;
              break;
            }
            currentIndex++;
          }
          for (int i = currentIndex; i < sLength; i++) {
            if (sArray[i] == '#') {
              secondLuggageIndex = i + 1;
              currentIndex++;
              break;
            }
            currentIndex++;
          }
          if (firstLuggageIndex != secondLuggageIndex) {
            System.out.println(firstLuggageIndex + "," + secondLuggageIndex);
          }
        }
    }
}   
