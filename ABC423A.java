import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int THOUSAND = 1000; 
        int x = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        int answer = x   / ( THOUSAND + c);
        System.out.println(answer * THOUSAND);

    }
} 
