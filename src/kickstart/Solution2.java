package kickstart;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        for (int i=1;i<=T;i++){
            int N=in.nextInt();
            int A=in.nextInt();
            int B=in.nextInt();
            int C=in.nextInt();
            int[] res=helper(N,A,B,C);
            System.out.print("case #"+i+":");
            if(A+B-N>C){
                System.out.print(" IMPOSSIBLE");
                System.out.println();
                continue;
            }
            for(int j=0;j<res.length;j++){
                System.out.print(" "+res[j]);
            }
            System.out.println();
        }
    }

    private static int[] helper(int n, int a, int b, int c) {
        int[] res=new int[n];
        int index=n-1;
        for(int i=b-c-1;i>=0;i--){
            res[res.length-1-i]=index--;
        }
        index=n-1;
        for(int i=a-c-1;i>=0;i--){
            res[i]=index--;
        }
        for(int i=a-c;i<a;i++){
            res[i]=n;
        }
        for(int i=0;i<res.length;i++){
            if(res[i]==0){
                res[i]=1;
            }
        }
        return res;
    }
}
