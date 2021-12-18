package shunfeng;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[] daikuan=new int[n];
        for(int i=0;i<n;i++){
            daikuan[i]=in.nextInt();
        }
        Arrays.sort(daikuan);
        int[][] customers=new int[m][2];
        for(int i=0;i<m;i++){
            customers[i][0]=in.nextInt();
            customers[i][1]=in.nextInt();
        }
        Arrays.sort(customers, (o1, o2) -> {
            if(o1[0]!=o2[0]){
                return o1[0]-o2[0];
            }else {
                return o2[1]-o1[1];
            }
        });
        int res=0;
        for(int i=0;i<daikuan.length;i++){
            int max=0;
            int index=0;
            for(int j=0;j<customers.length;j++){
                if(customers[j][0]!=0&&customers[j][0]<=daikuan[i]){
                    if(customers[j][1]>max){
                        max=customers[j][1];
                        index=j;
                    }
                }
            }
            customers[index][0]=0;
            res+=max;
        }
        System.out.println(res);

    }
}
