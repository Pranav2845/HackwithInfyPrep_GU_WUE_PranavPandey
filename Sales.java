package HackwithInfyPrep_GU_WUE_PranavPandey;
import java.util.*;
public class Sales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of elements
        int m = sc.nextInt(); // can carry m TV sets

        int sum = 0, cnt = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i<n; i++){
            if(arr[i]<0){
                cnt++;
                if(cnt<=m) sum+=Math.abs(arr[i]);
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
