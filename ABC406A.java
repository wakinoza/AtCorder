import java.util.*;

//ABC406A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();
        if (a > c) {
            System.out.println("Yes");
        } else if (a == c && b >= d){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}   