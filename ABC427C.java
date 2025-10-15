import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        NavigableMap<Long, Long> versionCounts = new TreeMap<>();
        for (long i = 1; i <= n; i++) {
          versionCounts.put(i, 1L);
        }

        for (int i = 0; i < q; i++) {
            long x = scanner.nextLong();
            long y = scanner.nextLong();

            Map<Long, Long> smallVersions = versionCounts.headMap(x, true); 

            long updateTotal = 0;
            List<Long> needRemoveKeys = new ArrayList<>();
            for (Long key : smallVersions.keySet()) {
                needRemoveKeys.add(key);
                updateTotal += smallVersions.get(key);
            }
            System.out.println(updateTotal);
            versionCounts.put(y, versionCounts.getOrDefault(y, 0L) + updateTotal);
            for (Long key : needRemoveKeys) {
              versionCounts.remove(key);
            }
        }
        scanner.close();
    }
} 