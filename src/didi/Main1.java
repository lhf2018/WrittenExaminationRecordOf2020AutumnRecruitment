package didi;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        List<Integer> lista=new ArrayList<>();
        List<Integer> listb=new ArrayList<>();
        for(int i=1;i<=9;i++){
            for(int j=0;j<=9;j++){
                for(int k=0;k<=9;k++){
                    if(i==j||i==k||j==k)continue;
                    int a=i*100+j*10+k;
                    int b=i*100+k*11;
                  if((a+b)==n){
                      lista.add(a);
                      listb.add(b);
                  }
                }
            }
        }
        int[][] arr=new int[lista.size()][2];
        for(int i=0;i<arr.length;i++){
            arr[i][0]=lista.get(i);
            arr[i][1]=listb.get(i);
        }
        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
        System.out.println(lista.size());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i][0]+" "+arr[i][1]);
        }
    }
}
