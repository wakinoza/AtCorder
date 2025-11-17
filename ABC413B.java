import java.util.*;

//ABC413B
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }
        scanner.close();

        Set <String> wordCats = new HashSet<>();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
              if (i == j) {
                continue;
              }
              wordCats.add(words[i] + words[j]);
              wordCats.add(words[j] + words[i]);
            }
        }
        System.out.println(wordCats.size());
    }
}   
