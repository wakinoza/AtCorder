import java.util.*;

//ABC411C
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        
        boolean[] isBlacks = new boolean[n + 1];
        int blackPeriodTotal = 0;
        for (int i = 0; i < q; i++) {
          int index = scanner.nextInt();
          if (n == 1) {
            if (isBlacks[index]) {
              blackPeriodTotal--;
              isBlacks[index] = false;
            }  else {
              blackPeriodTotal++;
              isBlacks[index] = true;
            }
            System.out.println(blackPeriodTotal);
            continue;
          } 
          if (index == 1) {
            if (isBlacks[1] && !isBlacks[2]) {
              blackPeriodTotal--;
              isBlacks[1] = false;
            } else if (!isBlacks[1] && !isBlacks[2]) {
              blackPeriodTotal++;
              isBlacks[1] = true;
            } else {
              if (isBlacks[1]) {
                isBlacks[1] = false;
              } else {
                isBlacks[1] = true;
              }
            }
          } else if(index == n) {
            if (isBlacks[n] && !isBlacks[n-1]) {
              blackPeriodTotal--;
              isBlacks[n] = false;
            } else if (!isBlacks[n] && !isBlacks[n-1]) {
              blackPeriodTotal++;
              isBlacks[n] = true;
            } else {
              if (isBlacks[n]) {
                isBlacks[n] = false;
              } else {
                isBlacks[n] = true;
              }
            }
          } else {
            if (isBlacks[index]) {
              if (!isBlacks[index - 1] && !isBlacks[index + 1]) {
                blackPeriodTotal--;
                isBlacks[index] = false;
              } else if (isBlacks[index - 1] && isBlacks[index + 1]) {
                blackPeriodTotal++;
                isBlacks[index] = false;
              } else {
                isBlacks[index] = false;
              }
            } else {
              if (!isBlacks[index - 1] && !isBlacks[index + 1]) {
                blackPeriodTotal++;
                isBlacks[index] = true;
              } else if (isBlacks[index - 1] && isBlacks[index + 1]) {
                blackPeriodTotal--;
                isBlacks[index] = true;
              } else {
                isBlacks[index] = true;
              }
            }
          }
          System.out.println(blackPeriodTotal);
        }
        scanner.close();
    }
}   

