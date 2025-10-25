import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Map<Long, Long> inputHash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long input = scanner.nextLong();
            inputHash.put(input, inputHash.getOrDefault(input, 0L) + 1);
        }

        long answer = 0;
        for(Long value : inputHash.values()){
            if (value >= 2) {
                answer += (value * (value - 1) / 2) * (n - value);
            }
        }
        System.out.println(answer);
    }
} 
