class Solution {
    
    public boolean check(char[][] arr,int i,int j,int n,int m,char tar){
        
        
        for(int t=0;t<9;t++){
            if(t!=j)
            if(arr[i][t] == tar) return false;
        }
        for(int t=0;t<9;t++){
            if(t!=i)
            if(arr[t][j] == tar) return false;
        }
        
        int l=i,u=j;
        if(i%3!=0){
            l-=(i%3);
        }
        if(j%3!=0){
            u-=(j%3);
        }
        for(int t  =  l;t<l+3;t++){
            for(int t1=u;t1<u+3;t1++){
                if(t!=i && t1!=j)
                if(arr[t][t1]==tar) return false;
            }
        }        
        return true;
    }
    
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]!='.')
                if(check(board,i,j,board.length,board[0].length,board[i][j])==false) return false;
            }
        }
        return true;
    }
}