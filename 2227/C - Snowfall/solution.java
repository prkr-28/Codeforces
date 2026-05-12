import java.util.ArrayList;
import java.util.List;
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
 
            List<Integer> div2 = new ArrayList<>();
            List<Integer> div3 = new ArrayList<>();
            List<Integer> div6 = new ArrayList<>();            
            List<Integer> nondiv = new ArrayList<>();     
            
            for(int ele:arr){
                if(ele%6==0){
                    div6.add(ele);
                }else if(ele%3==0){
                    div3.add(ele);
                }else if(ele%2==0){
                    div2.add(ele);
                }else{
                    nondiv.add(ele);
                }
            }
 
            List<Integer> res = new ArrayList<>();
            res.addAll(div2);
            res.addAll(nondiv);
            res.addAll(div3);
            res.addAll(div6);
 
            for(int ele:res){
                System.out.println(ele);
            }
        }
    }
}