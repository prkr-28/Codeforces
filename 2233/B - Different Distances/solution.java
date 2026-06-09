import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
 
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        String tStr = scanner.next();
        if (tStr == null) return;
        
        int t = Integer.parseInt(tStr);
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            
            int[] A = new int[n];
            int[] B = new int[n];
            
            for (int i = 0; i < n; i++) {
                A[i] = i + 1;       // A and D strictly increasing
                B[i] = n - i;       // B and C strictly decreasing
            }
            
            if (n % 2 != 0) {
                int M = (n + 1) / 2;
                
                int idx1 = n - (M + 1);
                int idx2 = n - M;
                
                int temp = B[idx1];
                B[idx1] = B[idx2];
                B[idx2] = temp;
            }
            
            for (int i = 0; i < n; i++) out.append(A[i]).append(" ");
            for (int i = 0; i < n; i++) out.append(B[i]).append(" ");
            for (int i = 0; i < n; i++) out.append(B[i]).append(" ");
            for (int i = 0; i < n; i++) out.append(A[i]).append(" ");
            
            out.append("
");
        }
        System.out.print(out);
    }
}