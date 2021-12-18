package ms;

public class Main4 {
    private static int[][] matirx;
    private static int[][] arrs;
    public static void getMatrix(int[][] matrix){
        matirx=matrix;
        arrs=new int[matrix.length+1][matrix[0].length+1];
        cal();
    }
    public static void cal(){
        for(int i=0;i<matirx.length;i++){
            for (int j=0;j<matirx[0].length;j++){
                arrs[i+1][j+1]=arrs[i][j+1]+arrs[i+1][j]-arrs[i][j]+matirx[i][j];;
            }
        }
    }
    public static int getVal(int x1,int y1,int x2,int y2){
        return arrs[Math.max(y2,y1)][Math.max(x1,x2)]
                -arrs[Math.max(y2,y1)-1][Math.min(x2,x1)]
                -arrs[Math.max(x2,x1)][Math.min(y2,y1)-1]
                +arrs[Math.min(x2,x1)-1][Math.min(y2,y1)-1];
    }

    public static void main(String[] args) {

    }
}
