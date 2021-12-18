package 国企.help;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(countPoints(1));
    }
    public static int countPoints(int rSqure)
    {
        int counter=0;
        int i=0,i2=0; //纵坐标变化量i
        int j=0,j2=0;//横坐标变化量j
        int temp=0;
        for(i=0;(i*i)<=rSqure;i++)   //i的变化量的平方值小于等于半径的平方值rSqure
        {
            for(j=0;(j*j)<=rSqure;j++) //j的变化量的平方值小于等于半径的平方值rSqure
            {
                i2=i*i;
                j2=j*j;
                temp=i2+j2;
                if(temp==rSqure)     //判断是否在圆周上
                    counter=counter+2;
            }
        }
        return counter;
    }

}
