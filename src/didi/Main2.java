package didi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long[][] arr=new long[n][n];
        List<Long> list=new ArrayList<>();
        list.add(1L);
        list.add(1L);
        for(int i=2;i<n*n;i++){
            list.add(list.get(i-1)+list.get(i-2));
        }
        int top=0;
        int right=arr[0].length-1;
        int bottom=arr.length-1;
        int left=0;
        int index=list.size()-1;
        while (left<=right&&top<=bottom&&index>=0){
            for (int i=left;i<=right;i++){
                arr[top][i]=list.get(index);
                index--;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=list.get(index);
                index--;
            }
            right--;
            for(int i=right;i>=left&&top<=bottom;i--){
                arr[bottom][i]=list.get(index);
                index--;
            }
            bottom--;
            for(int i=bottom;i>=top&&left<=right;i--){
                arr[i][left]=list.get(index);
                index--;
            }
            left++;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
                if(j!=arr[0].length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
