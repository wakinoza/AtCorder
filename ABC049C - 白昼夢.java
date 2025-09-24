import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String currentS = sb.toString();

        while (currentS.length() > 0) {

            char initialChar = currentS.charAt(0);
            if (initialChar == 'm') {
                if (currentS.length() >= 5 && currentS.substring(0,5).equals("maerd")) {
                    currentS = currentS.substring(5);
                } else {
                    System.out.println("NO");
                    return;
                }
            } else if (initialChar == 'e') {
                if (currentS.length() >= 5 && currentS.substring(0,5).equals("esare")) {
                    currentS = currentS.substring(5);
                } else {
                    System.out.println("NO");
                    return;
                }
            }else if (initialChar == 'r') {
                if (currentS.length() >= 6 && currentS.substring(0,6).equals("resare")) {
                    currentS = currentS.substring(6);
                } else if (currentS.length() >= 7 && currentS.substring(0,7).equals("remaerd")) {
                    currentS = currentS.substring(7);
                } else {
                    System.out.println("NO");
                    return;
                }
            } else {
                System.out.println("NO");
                    return;
            }
        }
        System.out.println("YES");
    }
} 

