package test.xiecheng;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int[] arr=new int[N];
        int num=0;
        OUTER:
        for(int i=0;i<N;i++){
            String temp=in.next();
            int index=temp.indexOf(",");
            int start=Integer.parseInt(temp.substring(0,index));
            int end=Integer.parseInt(temp.substring(index+1));
            for(int j=0;j<num;j++){
                if(start>=arr[j]){
                    arr[j]=end;
                    continue OUTER;
                }
            }
            arr[num]=end;
            num++;
        }
        System.out.println(num);
    }
}
