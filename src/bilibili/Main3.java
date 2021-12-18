package bilibili;

public class Main3 {
    public int GetCoinCount (int N) {
        // write code here
        int res=0;
        int charge=1024-N;
        while (charge>=64){
            charge-=64;
            res++;
        }
        while (charge>=16){
            charge-=16;
            res++;
        }
        while (charge>=4){
            charge-=4;
            res++;
        }
        while (charge>=1){
            charge-=1;
            res++;
        }
        return res;
    }
}
