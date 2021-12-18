package pinduoduo2;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n/2;j++){
                arr[i][j]=2;
            }
        }
        for(int i=0;i<n/2-1;i++){
            for(int j=(n+1)/2;j<n-1-i;j++){
                arr[i][j]=1;
            }
        }
        for(int i=1;i<=n/2-1;i++){
            for(int j=0;j<i;j++){
                arr[i][j]=3;
            }
        }
        for(int i=(n+1)/2;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                arr[i][j]=4;
            }
        }
        for(int i=n-1;i>n/2;i--){
            for(int j=n-i;j<=n/2-1;j++){
                arr[i][j]=5;
            }
        }
        for(int i=n-1;i>(n+1)/2;i--){
            for(int j=(n+1)/2;j<i;j++){
                arr[i][j]=6;
            }
        }
        for(int i=(n+1)/2;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                arr[i][j]=7;
            }
        }
        for(int i=1;i<n/2;i++){
            for(int j=n-1;j>n-1-i;j--){
                arr[i][j]=8;
            }
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
