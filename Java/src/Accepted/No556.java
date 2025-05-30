package Accepted;

public class No556 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row =mat.length;
        int col =mat[0].length;
        if(r*c!=row*col){return mat;}
        int row1=0;int col1=0;

        int[][] ChangeMat =new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ChangeMat[i][j]=mat[row1][col1];
                if(col1<col-1){col1+=1;}
                else {col1=0;row+=1;}
            }
        }
        return ChangeMat;
    }
}
