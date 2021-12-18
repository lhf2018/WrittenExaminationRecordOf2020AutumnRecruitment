package 国企;

import java.security.MessageDigest;

public class Solution {
    public String getResult(int i){
        boolean[] temp=new boolean[200001];
        for(int j=2;j<100000;j++){
            if(temp[j]){
                continue;
            }else{
                int count=2;
                while (count*j<=200000){
                    temp[count*j]=true;
                    count++;
                }
            }
        }
        int count=0;
        String res="";
        for(int j=2;j<temp.length;j++){
            if(!temp[j]){
                count++;
                if(count==i){
                    res=String.valueOf(j);
                    break;
                }
            }
        }
        try {
            MessageDigest m = null;
            m = MessageDigest.getInstance("MD5");
            m.update(res.getBytes("UTF8"));
            byte s[] = m.digest();
            String result = "";
            for (int j = 0; j < s.length; j++) {
                result += Integer.toHexString((0x000000FF & s[j]) | 0xFFFFFF00).substring(6);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
