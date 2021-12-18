package langchao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        List<Integer> jishu=new ArrayList<>();
        List<Integer> oushu=new ArrayList<>();
        for(int i=0;i<len;i++){
            int temp=in.nextInt();
            if(temp%2==0){
                oushu.add(temp);
            }else {
                jishu.add(temp);
            }
        }
        Collections.sort(jishu);
        Collections.sort(oushu);
        jishu.add(0,-1);
        jishu.add(101);
        oushu.add(0,0);
        oushu.add(102);
        int max=0;
        int index=-1;
        for(int i=1;i<jishu.size();i++){
            max=Math.max(max,(jishu.get(i)-jishu.get(i-1))/2-1);
            if(max==(jishu.get(i)-jishu.get(i-1))/2-1){
                index=jishu.get(i-1)+2;
            }
        }
        for(int i=1;i<oushu.size();i++){
            max=Math.max(max,(oushu.get(i)-oushu.get(i-1))/2-1);
            if(max==(oushu.get(i)-oushu.get(i-1))/2-1){
                index=oushu.get(i-1)+2;
            }
        }
        System.out.println(index+" "+max);
    }
}
