package HackwithInfyPrep_GU_WUE_PranavPandey;
import java.util.*;
public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int implement = 0;
        for(int i = 0; i<n; i++){
            int cnt = 0;
            for(int j=0; j<3; j++){
                int x = sc.nextInt();
                if(x==1) cnt++;
            }
            if(cnt >=2) implement++;
        }
        System.out.println(implement);
        sc.close();
    }
}
