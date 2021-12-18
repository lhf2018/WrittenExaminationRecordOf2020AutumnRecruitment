package vmware;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int r=in.nextInt();
        int row=0;
        int col=0;
        while (m-->0){
            int len=r;
            while (len-->0){
                if(row==0&&col<n){
                    col++;
                }else if(col==n&&row<n){
                    row++;
                }else if(row==n&&col>0){
                    col--;
                }else if(col==0&&row>0){
                    row--;
                }
            }
            System.out.println(col+".00 "+row+".00");
        }
    }
}
