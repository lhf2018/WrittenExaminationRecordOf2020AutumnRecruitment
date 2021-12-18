package kedaxunfei;

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x1=in.nextInt();
        int y1=in.nextInt();
        int x2=in.nextInt();
        int y2=in.nextInt();
        int x3=in.nextInt();
        int y3=in.nextInt();
        int x4=in.nextInt();
        int y4=in.nextInt();
        if(!(x3>=x2||x1>=x4||y3>=y2||y1>=y4)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
