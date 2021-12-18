package huanjusd;



public class Solution {
    /**
     * 找到比输入的整数大的下一个水仙花数
     * @param n int整型 输入的整数
     * @return long长整型
     */
    public long nextNarcissisticNumber (int n) {
        // write code here
        long index=n+1;
        while (!helper(index)){
            index++;
        }
        return index;
    }

    private boolean helper(long index) {
        String str=String.valueOf(index);
        int[] nums=new int[str.length()];
        int r=str.length();
        for(int i=0;i<nums.length;i++){
            nums[i]=str.charAt(i)-'0';
        }
        long res=0;
        for(int i=0;i<nums.length;i++){
            res+=Math.pow(nums[i],r);
        }
        return res==index;
    }

}
