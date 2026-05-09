import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int op = 0;
            for (char c : s.toCharArray()) {
                if (c == '(') op++;
            }
            if (op * 2 == n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}