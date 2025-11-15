

import java.util.*;

//ABC432A
public class ABC432A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputs = new int[3];
        for (int i = 0; i < 3; i++) {
            inputs[i] = scanner.nextInt(); 

        }
        scanner.close();
        Arrays.sort(inputs);
        System.out.print(inputs[2]);
        System.out.print(inputs[1]);
        System.out.println(inputs[0]);

    }
}   

