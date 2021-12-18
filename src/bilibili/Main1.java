package bilibili;

public class Main1 {
    public boolean Game24Points (int[] arr) {
        // write code here
        return helper(arr,new boolean[4],0.0);
    }

    private boolean helper(int[] arr, boolean[] used, double res) {
        for(int i=0;i<arr.length;i++){
            if(!used[i]){
                used[i]=true;
                if(helper(arr,used,res+arr[i])
                        ||helper(arr,used,res-arr[i])
                        ||helper(arr,used,res*arr[i])
                        ||helper(arr,used,res/arr[i])){
                    return true;
                }
                used[i]=false;
            }
        }
        return res==24;
    }
}
