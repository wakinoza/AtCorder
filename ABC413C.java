import java.util.*;

//ABC413C

class Value {
  private long c;
  private long x;

  public Value(long c, long x) {
    this.c = c;
    this.x = x;
  }


  public long getC() {
    return this.c;
  }

  public long getX() {
    return this.x;
  }

  public void setC(long c) {
    this.c = c;
  }
  
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        List<Value> values = new ArrayList<>();
        for (int i = 0; i < q; i++) {
          int query = scanner.nextInt();
          if (query == 1) {
            long c = scanner.nextLong();
            long x = scanner.nextLong();
            values.add(new Value(c,x));

          } else {
            long k = scanner.nextLong();
            long count = 0;
            long total = 0L;
            while (count < k) {
              Value value = values.get(0);
              long currentCount = Math.min(value.getC(),k - count);
              count += currentCount;
              total += currentCount * value.getX();
              if (value.getC() - currentCount == 0) {
                values.remove(0);
              } else {
                value.setC(value.getC() - currentCount);
              }
            }
            System.out.println(total);
          }
        }
        scanner.close();
    }
}   

