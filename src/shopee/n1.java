package shopee;

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int people=in.nextInt();
        int task=in.nextInt();
        int[][] dp=new int[people][task];
        int[] point=new int[people];
        for(int i=0;i<point.length;i++){
            point[i]=-1;
        }
        int temp=0;
        for(int i=0;i<people;i++){
            int time=in.nextInt();
            for(int j=0;j<time;j++){
                dp[i][j]=in.nextInt();
            }
            temp+=time;
        }
        if(temp<task){
            System.out.println(-1);
            return;
        }else {
            int total=0;
            while (task>0){
                int index=-1;
                int tt=Integer.MAX_VALUE;
                for(int i=0;i<dp.length;i++){
                    if(dp[i][point[i]+1]<tt){
                        index=i;
                    }
                }
                point[index]++;
                task--;
                total+=dp[index][point[index]];
            }
            System.out.println(total);
        }

    }
}
