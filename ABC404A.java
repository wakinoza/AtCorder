import java.util.*;

//ABC404A
public class Main {
    public static void main(String[] args) {
        Map <Integer, Boolean> codeHash = new HashMap<>();
        for (int i = 97; i <= 122; i++) {
          codeHash.put(i,true);
        }
        Scanner scanner = new Scanner(System.in);
        char[] sArray = scanner.next().toCharArray();
        scanner.close();
        for (char s : sArray) {
          int sInt = s;
          codeHash.replace(sInt,false);
        }
        for(Map.Entry<Integer, Boolean> entry : codeHash.entrySet()){
          if (entry.getValue()) {
            int answerInt = entry.getKey();
            char answer = (char)answerInt;
            System.out.println(answer);
            return;
          }
        }
	  }
}
