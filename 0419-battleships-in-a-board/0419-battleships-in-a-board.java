class Solution {
    public int countBattleships(char[][] board) {
        int row_length=board.length;
        int col_length=board[0].length;
        int count=0;
        for(int i=0;i<row_length;i++)
        {
            for(int j=0;j<col_length;j++)
            {
                if(board[i][j]=='X')
                {
                    boolean top=(i==0 || board[i-1][j]!='X');
                    boolean left=(j==0 || board[i][j-1]!='X');
                    if(top && left) count++;
                }

                
            }
        }
        return count;
        
        
    }
}