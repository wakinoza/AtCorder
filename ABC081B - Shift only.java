import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int divisionTotal = 0;
        boolean isEvenAll = true;
        int[] inputs = new int[n];
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            if (input % 2 == 1) {
                isEvenAll = false;
            }
            inputs[i] = input;
        }
        scanner.close();

        while (isEvenAll) {
            divisionTotal++;
            for (int i = 0; i < n; i++) {
                int currentInputDivision = inputs[i] / 2;
                inputs[i] = currentInputDivision;
                if (currentInputDivision % 2 == 1) {
                    isEvenAll = false;
                }
            }
        }
        System.out.println(divisionTotal);
    }
} 
