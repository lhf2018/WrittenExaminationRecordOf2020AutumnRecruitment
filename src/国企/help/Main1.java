package 国企.help;

import java.util.ArrayList;
import java.util.Collections;

public class Main1 {
    private static int longestConMonoSubArr(int[] arr){
        // 判断数组是都为空，为空返回0
        if (arr.length <= 0)
            return 0;
        int first = 0;
        int last = 0;
        int index = 0;
        // 各种长度的连续单调子序列长度，都放入集合中，一会比较出最大值；
        ArrayList<Integer> list = new ArrayList<>();		// 1 单点递增连续子序列的情况，没有破坏数组的元素顺序
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                last = i;			}
            else {
                index = last - first + 1; // 连续递增中断，记录子序列长度
                list.add(index); // 保存到集合中
                first = last = i; // 指针归到i所在位置继续
            }
        } 		// 2 单调递减连续子序列情况
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                last = i;
            } else {
                index = last - first + 1;
                list.add(index);
                first = last = i; // 指针归到i所在位置继续
                }
        }
        Integer max = Collections.max(list);
        return max;
    }
}
