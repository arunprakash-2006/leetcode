class Solution {
    int[]dx={0,0,-1,1};
    int [] dy={-1,1,0,0};
    public void solve(char[][] board) {
        int row_size=board.length;
        int col_size=board[0].length;
        for(int i=0;i<row_size;i++)
        {
            if(board[i][0]=='O') dfs(board,i,0);
            if(board[i][col_size-1]=='O') dfs(board,i,col_size-1); 
        }

        for(int i=0;i<col_size;i++)
        {
            if(board[0][i]=='O') dfs(board,0,i);
            if(board[row_size-1][i]=='O') dfs(board,row_size-1,i);
        }

        for(int i=0;i<row_size;i++)
        {
            for(int j=0;j<col_size;j++)
            {
                if(board[i][j]=='O') board[i][j]='X';
                if(board[i][j]=='T') board[i][j]='O';
            }
        }
        
    }

    void dfs(char[][] board,int r,int c)
    {
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c]!='O') return;
        board[r][c]='T';
        for(int i=0;i<4;i++)
        {
            dfs(board,r+dx[i],c+dy[i]);
        }
    }
}