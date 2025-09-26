import java.util.*;

class SkillNumber {
  List<Integer> numbers = new ArrayList<>();
  
  public List<Integer> getNumbers() {
    return this.numbers;
  }
  public void addNumbers(int n) {
    this.numbers.add(n);
  }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean[] acquiredSkills = new boolean[n + 1];
        Arrays.fill(acquiredSkills, false);
        
        SkillNumber[] prerequisiteFor = new SkillNumber[n + 1];
        Deque<Integer> deque = new ArrayDeque<Integer>();

        for (int i = 1; i <= n ; i++) {
          int a = scanner.nextInt();
          int b = scanner.nextInt();
          
          if (a == 0 && b == 0) {
            acquiredSkills[i] = true;
            deque.add(i);
          } else {
            if (prerequisiteFor[a] == null) {
              prerequisiteFor[a] = new SkillNumber();
            } 
            prerequisiteFor[a].addNumbers(i);

            if (prerequisiteFor[b] == null) {
              prerequisiteFor[b] = new SkillNumber();
            }
            prerequisiteFor[b].addNumbers(i);
          }
        }
        scanner.close();
        
        while(deque.size() > 0) {
          int currentSkill = deque.poll();
          
          if (prerequisiteFor[currentSkill] != null){
            List<Integer> prerequisites = prerequisiteFor[currentSkill].getNumbers();
            for (Integer prerequisite : prerequisites) {
              if (!acquiredSkills[prerequisite]){
              acquiredSkills[prerequisite] = true;
              deque.add(prerequisite);
              }
            }
          }
        }

        int skillTotal = 0;
        for (boolean value : acquiredSkills) {
          if(value) {
            skillTotal++;
          }
        }
        System.out.println(skillTotal);
    }
} 