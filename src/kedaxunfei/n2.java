package kedaxunfei;

import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        sort(arr,0,n-1);

    }
    private static void sort(int[] arr,int start,int end){
        if(start<end){
            int key=arr[start];
            int i=start+1;
            int j=end;
            while (true){
                while (j>start&&arr[j]>=key){
                    j--;
                }
                while (i<end&&arr[i]<=key){
                    i++;
                }
                if(i<j){
                    swap(arr,i,j);
                }else {
                    break;
                }
            }
            swap(arr,start,j);
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]);
                if(k!=arr.length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
            sort(arr,start,j-1);
            sort(arr,j+1,end);

        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
