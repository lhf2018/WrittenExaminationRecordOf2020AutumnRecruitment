package test.wangyi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        int blood=in.nextInt();
        int[][] array=new int[len][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<len;j++){
                array[j][i]=in.nextInt();
            }
        }
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int total=0;
        for(int i=0;i<array.length;i++){
            if(array[i][0]>blood){
                total+=array[i][1];
            }
            blood++;
        }
        System.out.println(total);
    }
}
