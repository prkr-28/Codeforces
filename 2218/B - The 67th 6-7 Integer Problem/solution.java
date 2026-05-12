import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int[] arr = new int[7];
            for (int i = 0; i < 7; i++) {
                arr[i] = scanner.nextInt();
            }
 
            int maxsum = Integer.MIN_VALUE;
            for (int i = 0; i < 7; i++) {
                int sum=0;
                for(int j=0;j<7;j++){
                    if(i==j){
                        sum+=arr[j];
                    }
                    else{
                        sum+=(-1*arr[j]);
                    }
                }
                maxsum=Math.max(maxsum,sum);
            }
            
            System.out.println(maxsum);
        }
    }
}