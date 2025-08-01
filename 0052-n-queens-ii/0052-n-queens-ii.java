class Solution {
    public int totalNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
         for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        solve(0,n,ans,board);
        return ans.size();
    }
    public void solve(int col,int n,List<List<String>> ans,char[][]board)
    {
        if(col==n)
        {
            List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for(int row=0;row<n;row++)
        {
            if(isWay(row,col,n,board))
            {
                board[row][col]='Q';
                solve(col+1,n,ans,board);
                board[row][col]='.';
            }
        }
    }

    public boolean isWay(int row,int col,int n,char[][] board)
    {
        int dupr=row;
        int dupc=col;
        while(row>=0 && col>=0)
        {
            if(board[row][col]=='Q') return false;
            row--;
            col--;
        }
        row=dupr;
        col=dupc;
        while(col>=0)
        {
            if(board[row][col]=='Q') return false;
            col--;
        }
        row=dupr;
        col=dupc;
        while(row<n && col>=0)
        {
            if(board[row][col]=='Q') return false;
            col--;
            row++;
        }
        return true;
    }
        
    }
