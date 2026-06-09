import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            return;
        }
        int t = scanner.nextInt();
 
        while (t-- > 0) {
            long n = scanner.nextLong();
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long z = scanner.nextLong();
 
            long combinedSpeedWithoutAI = x + y;
            long timeWithoutAI = (n + combinedSpeedWithoutAI - 1) / combinedSpeedWithoutAI;
 
            long timeWithAI;
            long linesWrittenDuringSetup = z * x;
 
            if (n <= linesWrittenDuringSetup) {
                timeWithAI = (n + x - 1) / x;
            } else {
                long remainingLines = n - linesWrittenDuringSetup;
                long combinedSpeedWithAI = x + 10 * y;
                long additionalHours = (remainingLines + combinedSpeedWithAI - 1) / combinedSpeedWithAI;
                timeWithAI = z + additionalHours;
            }
 
            System.out.println(Math.min(timeWithoutAI, timeWithAI));
        }
 
        scanner.close();
    }
}