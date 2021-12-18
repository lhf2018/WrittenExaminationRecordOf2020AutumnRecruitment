package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoadBalance {
    public static void main(String[] args) {
        int[] config_weight=new int[3];//配置权重
        Map<Integer,String> map=new HashMap<>();
        map.put(0,"A");
        map.put(1,"B");
        map.put(2,"C");
        config_weight[0]=5;
        config_weight[1]=1;
        config_weight[2]=1;
        int[] eff_weight=config_weight.clone();//有效权重,初始化为配置权重
        List<String> list=new ArrayList<>();
        for(int i=0;i<7;i++){
            list.add(getServer(config_weight,eff_weight,map));
        }
        System.out.println(list);

    }
    public static String getServer(int[] config_weight,int[] eff_weight,Map<Integer,String> map){
        int currentPos=-1;
        int max=0;
        int curWeightSum=0;
        for(int i=0;i<eff_weight.length;i++){
            if(eff_weight[i]>max){
                currentPos=i;
                max=eff_weight[i];
            }
            curWeightSum+=eff_weight[i];
        }
        eff_weight[currentPos]-=curWeightSum;
        for(int i=0;i<eff_weight.length;i++){
            eff_weight[i]=eff_weight[i]+config_weight[i];
        }
        return map.get(currentPos);
    }
}
