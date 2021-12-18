package ms;

public class Main3 {
    public static void main(String[] args) {
        get();
    }
    public static void get(){
        boolean[] temp=new boolean[200001];
        for(int i=2;i<100000;i++){
            if(temp[i]){
                continue;
            }else{
                int count=2;
                while (count*i<=200000){
                    temp[count*i]=true;
                    count++;
                }
            }
        }
        int count=0;
        for(int i=2;i<temp.length;i++){
            if(!temp[i]){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("=====");
        System.out.println(count);
    }
}
