package tecent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int lena=in.nextInt();
        int[] numsa=new int[lena];
        for(int i=0;i<lena;i++){
            numsa[i]=in.nextInt();
        }
        int lenb=in.nextInt();
        int[] numsb=new int[lenb];
        for(int i=0;i<lenb;i++){
            numsb[i]=in.nextInt();
        }
        List<Integer> list=new ArrayList<>();
        int first=0;
        int second=0;
        while (first<lena&&second<lenb){
            if(numsa[first]==numsb[second]){
                list.add(numsa[first]);
                first++;
                second++;
            }else if(numsa[first]>numsb[second]){
                first++;
            }else {
                second++;
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            if(i!=list.size()-1){
                System.out.print(" ");
            }
        }
    }
}
