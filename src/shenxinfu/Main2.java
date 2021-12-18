package shenxinfu;

public class Main2 {
    public int house (int[] person) {
        // write code here
        int index=-1;
        int min=Integer.MAX_VALUE;
        int[] dp=new int[person.length];
        for(int i=0;i< person.length;i++){
            if(person[i]<min){
                min=person[i];
                index=i;
            }
        }
        dp[index]=1;
        int res=0;
        for(int i=0;i<dp.length;i++){
            res+=dp[i];
        }
        return res;
    }
}
