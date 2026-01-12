import java.util.*;

//ABC394B
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] sArray = scanner.next().toCharArray();
        scanner.close();
        List<Integer> aIndexes = new ArrayList<>();
        List<Integer> bIndexes = new ArrayList<>();
        Set<Integer> cIndexes = new HashSet<>();
        for (int i = 0; i < sArray.length; i++) {
          char currentLetter = sArray[i];
          if (currentLetter == 'A') {
            aIndexes.add(i);
          } else if (currentLetter == 'B') {
            bIndexes.add(i);
          } else if (currentLetter == 'C') {
            cIndexes.add(i);
          }
        }
        int answerTotal = 0;
        for (Integer aIndex : aIndexes) {
          for (Integer bIndex : bIndexes) {
            if (aIndex > bIndex) {
              continue;
            }
            int diff = bIndex - aIndex;
            if (cIndexes.contains(bIndex + diff)) {
              answerTotal++;
            }
          }
        }
        System.out.println(answerTotal);
    }
}   

