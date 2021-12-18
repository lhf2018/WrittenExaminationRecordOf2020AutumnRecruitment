package xiaomi;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String temp=in.next();
            if(temp.length()<8||temp.length()>120){
                System.out.println(1);
                continue;
            }
            if(!helper(temp)){
                System.out.println(2);
                continue;
            }
            System.out.println(0);
        }
    }

    private static boolean helper(String temp) {
        boolean num=false;
        boolean lowchar=false;
        boolean highchar=false;
        boolean fuhao=false;
        for(char c:temp.toCharArray()){
            if(c-'0'>=0&&c-'0'<=9){
                num=true;
            }else if(c-'a'>=0&&c-'a'<26){
                lowchar=true;
            }else if(c-'A'>=0&&c-'A'<26){
                highchar=true;
            }else {
                fuhao=true;
            }
        }
        return num&&lowchar&&highchar&&fuhao;
    }
}
