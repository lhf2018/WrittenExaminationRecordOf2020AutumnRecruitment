package aiqiyi;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        while (str.contains("()")||str.contains("{}")||str.contains("[]")){
            str=str.replace("()","").replace("{}","").replace("[]","");
        }
        if(str.length()==0){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
