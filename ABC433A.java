import java.util.*;

//ABC433A
//public class Main {
public class ABC433A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        scanner.close();

        if ((x - y * z) % (z - 1) == 0 && x - y * z >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}   

