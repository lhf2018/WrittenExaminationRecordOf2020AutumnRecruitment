package pinduoduo;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int lunch=in.nextInt();
        int dinner=in.nextInt();
        int[][] luns=new int[lunch][2];
        int[][] dins=new int[dinner][2];
        int target=in.nextInt();
        for(int i=0;i<lunch;i++){
            luns[i][0]=in.nextInt();
            luns[i][1]=in.nextInt();
        }
        for(int i=0;i<dinner;i++){
            dins[i][0]=in.nextInt();
            dins[i][1]=in.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<lunch;i++){
            if(luns[i][1]>=target){
                min=Math.min(luns[i][0],min);
                continue;
            }
            for(int j=0;j<dinner;j++){
                if(dins[j][1]>=target){
                    min=Math.min(dins[j][0],min);
                    continue;
                }
                if(luns[i][1]+dins[j][1]>=target){
                    min=Math.min(luns[i][0]+dins[j][0],min);
                }
            }
        }
        if(min==Integer.MAX_VALUE){
            System.out.println(-1);
        }else {
            System.out.println(min);
        }

    }
}
