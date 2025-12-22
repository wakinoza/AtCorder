import java.util.*;

//ABC401A
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        scanner.close();
        if (s >= 200 && s <= 299) {
          System.out.println("Success");
        } else {
          System.out.println("Failure");
        }
    }
}   
