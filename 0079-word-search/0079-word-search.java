class Solution {
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        boolean vis[][]=new boolean[row][col];
        int wrow=0,wcol=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    wrow=i;
                    wcol=j;
                    if(dfs(wrow,wcol,row,col,0,board,word,vis))
                    return true;
        
                }

            }
        }

        return false;
    }

        public boolean dfs(int wrow,int wcol,int row,int col,int index,char[][] board,String word,boolean vis[][])
        {
            if(index==word.length()) return true;
            if(wrow<0 || wcol<0 || wrow>=row || wcol>=col || vis[wrow][wcol] || board[wrow][wcol]!=word.charAt(index)) return false;
            vis[wrow][wcol]=true;
            boolean found=dfs(wrow+1,wcol,row,col,index+1,board,word,vis) ||
            dfs(wrow,wcol+1,row,col,index+1,board,word,vis) ||
            dfs(wrow-1,wcol,row,col,index+1,board,word,vis) ||
            dfs(wrow,wcol-1,row,col,index+1,board,word,vis);
            vis[wrow][wcol]=false;
            return found;



            
        }

        
    
}