import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
 
            int minSum = 0;
            for (int ele : arr) {
                if (ele > 1) {
                    minSum += ele;
                }
            }
            if (arr[n - 1] == 1) {
                minSum += 1;
            }
            System.out.println(minSum);
        }
    }
}