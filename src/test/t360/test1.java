package test.t360;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char[] DNA1=in.next().toCharArray();
        char[] DNA2=in.next().toCharArray();
        if(DNA1.length==0) System.out.println(0);
        int dT=0;
        int dA=0;
        for(int i=0;i<DNA2.length;i++){
            if(DNA1[i]!=DNA2[i]){
                if(DNA1[i]=='A'){
                    dA++;
                }else{
                    dT++;
                }
            }
        }
        int sum=0;
        sum=Math.min(dA,dT);
        sum+=(Math.max(dA,dT)-sum);
        System.out.println(sum);
    }
}
