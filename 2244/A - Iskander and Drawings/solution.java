import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            int maxTime = 0;
            int cnt = 0;
 
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '#') {
                    cnt++;
                } else {
                    if (cnt > 0) {
                        maxTime = Math.max(maxTime, (cnt + 1) / 2);
                        cnt = 0;
                    }
                }
            }
 
            // Last block
            if (cnt > 0) {
                maxTime = Math.max(maxTime, (cnt + 1) / 2);
            }
 
            System.out.println(maxTime);
        }
 
        sc.close();
    }
}