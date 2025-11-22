import java.util.*;

//ABC433C
//public class Main {
public class ABC433C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] sArray = scanner.next().toCharArray();
        scanner.close();
        List<Line> numberCounts = new ArrayList<>();
        char prevNumber = sArray[0];
        int count = 1;
        for (int i = 1; i < sArray.length; i++) {
          char current = sArray[i];
          if (current == prevNumber) {
            count++;
          } else {
            numberCounts.add(new Line(prevNumber, count));
            prevNumber = current;
            count = 1;
          }
        }
        numberCounts.add(new Line(prevNumber, count));

        long total = 0L;
        char prevLineNumber = numberCounts.get(0).getNumber();
        int prevLineCount = numberCounts.get(0).getCount();
        for (int i = 1; i < numberCounts.size(); i++) {
          char currentLineNumber = numberCounts.get(i).getNumber();
          int currentLineCount = numberCounts.get(i).getCount();
          int difference = currentLineNumber - prevLineNumber;
          if(difference == 1) {
            total += Math.min(prevLineCount, currentLineCount);
          }
          prevLineCount = currentLineCount;
          prevLineNumber = currentLineNumber;
        }
        System.out.println(total);
    }
}   

class Line {
  private char number;
  private int count;

  public Line(char number, int count){
    this.number = number;
    this.count = count;
  }

  public char getNumber() {
    return this.number;
  }
  public int getCount() {
    return this.count;
  }
}
