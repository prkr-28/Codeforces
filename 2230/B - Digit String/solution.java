import java.util.Scanner;
 
 
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
 
 
        while (t-- > 0) {
            String s = scanner.next();
            int n = s.length();
            int total13 = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == '1' || c == '3') {
                    total13++;
                }
            }
            int current2 = 0;
            int current13 = total13;
            int maxKept = current13; 
 
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                
                if (c == '2') {
                    current2++;
                } else if (c == '1' || c == '3') {
                    current13--;
                }
                maxKept = Math.max(maxKept, current2 + current13);
            }
 
            System.out.println(n - maxKept);
        }
    }
}