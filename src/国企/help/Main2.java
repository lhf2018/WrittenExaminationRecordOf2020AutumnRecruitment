package 国企.help;

public class Main2 {

    public static int leastMajorityMultiple(int a, int b, int c, int d, int e)
    {
        int i = 1;
        int count = 0;//能整除的次数
        while(i > 0)
        {
            if(i % a == 0) count++;
            if(i % b == 0) count++;
            if(i % c == 0) count++;
            if(i % d == 0) count++;
            if(i % e == 0) count++;
            if(count >= 3)
            {
                break;
            }
            count = 0;//若count值小于3，恢复到0
            i++;//不满足条件，i++
        }
        return i;
    }
}
