package pinduoduo;

import java.util.Scanner;

public class Maint2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int dis=in.nextInt();
        int len=in.nextInt();
        int num=0;//回退次数
        int[] arr=new int[len];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
            if(arr[i]==dis){
                System.out.println("paradox");
                return;
            }else {
                if(arr[i]<dis){
                    dis-=arr[i];
                }else{
                    dis=arr[i]-dis;
                    num++;
                }
            }
        }
        System.out.println(dis+" "+num);
    }
}
