import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int prevX = 0;
        int prevY = 0;
        int prevT = 0;
        for (int i = 0; i < n ; i++) {
            int currentT = scanner.nextInt();
            int currentX = scanner.nextInt();
            int currentY = scanner.nextInt();

            int minDistance = Math.abs(currentX - prevX) + Math.abs(currentY - prevY);
            int numOfMove = currentT - prevT;
            if (numOfMove < minDistance) {
                System.out.println("No");
                return;
            }

            if ((minDistance % 2) != (numOfMove % 2)) {
                System.out.println("No");
                return;
            }
            prevX = currentX;
            prevY = currentY;
            prevT = currentT;
        }
        scanner.close();
        System.out.println("Yes");
    }
} 