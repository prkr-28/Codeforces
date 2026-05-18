import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            while (t-- > 0) {
                long n = scanner.nextLong();
                long a = scanner.nextLong();
                long b = scanner.nextLong();
                
                if (3 * a <= b) {
                    System.out.println(n * a);
                }
                else {
                    long groupKeys = n / 3;
                    long remainder = n % 3;
                    long costOption1 = (groupKeys * b) + (remainder * a);
                    
                    long costOption2 = (groupKeys * b) + b;
                    System.out.println(Math.min(costOption1, costOption2));
                }
            }
        }
        scanner.close();
    }
}