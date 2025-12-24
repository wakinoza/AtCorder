import java.util.*;

//ABC400A
public class Main {
    public static void main(String[] args) {
        final int TOTAL = 400;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        if (TOTAL % a == 0) {
            System.out.println(TOTAL / a);
        } else {
            System.out.println(-1);
        }
    }
}   
