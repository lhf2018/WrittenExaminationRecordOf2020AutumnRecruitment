package test.ali;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S=in.next();
        String T=in.next();
        if(S.length()==0){
            System.out.println(-1);
        }
        int[] dp=new int[S.length()];
        int[] num=new int[26];
        int total=0;
        dp[0]=(S.charAt(0)==T.charAt(0)?1:0);
        int Sstart=0;
        int Tstart=0;
        while(Sstart<S.length()){
            if(S.charAt(Sstart)!=T.charAt(Tstart)){
                num[S.charAt(Sstart)-'a']++;
                total++;
            }else {
                Tstart++;
            }
            Sstart++;
        }
        for(int i=0;i<num.length;i++){
            if(num[i]!=0){
                System.out.println((char)(i+'a')+"  "+num[i]);
            }
        }
        boolean flag=false;
        for(int i=Tstart;i<S.length();i++){
            num[T.charAt(Tstart)-'a']--;
            if(num[T.charAt(Tstart)-'a']<0){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println(-1);
        }else {
            System.out.println(total);
        }

    }
}
