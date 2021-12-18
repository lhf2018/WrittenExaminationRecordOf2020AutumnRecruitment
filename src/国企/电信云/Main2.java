package 国企.电信云;

public class Main2 {
    public static void main(String[] args) {
        for(int i=0;i<=9;i++){
            for(int j=0;j<=9;j++){
                for(int k=0;k<=9;k++){
                    for(int m=0;m<=9;m++){
                        int temp=i*1001+j*1100+k*110+m*11;
                        if(temp==8888){
                            System.out.println(i+" "+j+" "+k+" "+m);
                        }
                    }
                }
            }
        }
    }
}
