package 国企.电信云;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int two=0;
        int three=0;
        int five=0;
        List<Integer> list=new ArrayList<>();
        list.add(1);
        for(int i=1;i<N;i++){
            int temp=Math.min(list.get(two)*2,Math.min(list.get(three)*3,list.get(five)*5));
            if(temp==list.get(two)*2){
                two++;
            }
            if(temp==list.get(three)*3){
                three++;
            }
            if(temp==list.get(five)*5){
                five++;
            }
            list.add(temp);
        }
        System.out.println(list.get(N-1));
    }
}
