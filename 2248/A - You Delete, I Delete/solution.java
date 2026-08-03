import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            String s = sc.next();
 
            StringBuilder sb = new StringBuilder();
            boolean removedZero = false;
            for (char c : s.toCharArray()) {
                if (!removedZero && c == '0') {
                    removedZero = true;
                    continue;
                }
                sb.append(c);
            }
 
            StringBuilder ans = new StringBuilder();
            boolean removedOne = false;
            for (int i = 0; i < sb.length(); i++) {
                char c = sb.charAt(i);
                if (!removedOne && c == '1') {
                    removedOne = true;
                    continue;
                }
                ans.append(c);
            }
 
            System.out.println(ans);
        }
    }
}