package meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int A=in.nextInt();
        int B=in.nextInt();
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=in.nextInt();
            arr[i][1]=in.nextInt();
        }
        Arrays.sort(arr, (o1, o2) -> Math.max(o2[0],o2[1])-Math.max(o1[0],o1[1]));
        int index=0;
        int count=0;
        while (A>0&&B>0){
            if(arr[index][0]>arr[index][1]){
                count+=arr[index][0];
                A--;
            }else {
                count+=arr[index][1];
                B--;
            }
            arr[index][0]=0;
            arr[index][1]=0;
            index++;
        }
        index=0;
        if(A>0){
            Arrays.sort(arr, (o1, o2) -> o2[0]-o1[0]);
            while (A>0){
                count+=arr[index++][0];
                A--;
            }
        }
        if(B>0){
            Arrays.sort(arr, (o1, o2) -> o2[1]-o1[1]);
            while (B>0){
                count+=arr[index++][1];
                B--;
            }
        }
        System.out.println(count);
    }
}
