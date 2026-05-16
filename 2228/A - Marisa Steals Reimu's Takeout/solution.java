import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
 
        while (t-- > 0) {
            int n = scanner.nextInt();
 
            int c0 = 0;
            int c1 = 0;
            int c2 = 0;
 
            // Count the frequencies of 0, 1, and 2
            for (int i = 0; i < n; i++) {
                int w = scanner.nextInt();
                if (w == 0) {
                    c0++;
                } else if (w == 1) {
                    c1++;
                } else if (w == 2) {
                    c2++;
                }
            }
 
            int maxOperations = 0;
            maxOperations += c0;
            int pairs = Math.min(c1, c2);
            maxOperations += pairs;
            int leftovers = Math.abs(c1 - c2);
            maxOperations += (leftovers / 3);
            System.out.println(maxOperations);
        }
 
        scanner.close();
    }
}