class Pair
{
    int row;
    int col;
    int time;
    Pair(int row,int col,int time)
    {
        this.row=row;
        this.col=col;
        this.time=time;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int r_size=grid.length;
        int c_size=grid[0].length;
        int [][] vis=new int[r_size][c_size];
        int m_time=0;
        int fresh_oranges=0;
        int fresh_to_rotten=0;
        Queue<Pair> q1=new LinkedList<>();
        for(int i=0;i<r_size;i++)
        {
            for(int j=0;j<c_size;j++)
            {
                if(grid[i][j]==2)
                {
                    q1.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }
                else if(grid[i][j]==1)
                {
                    vis[i][j]=0;
                    fresh_oranges++;
                }

            }
        }

        int dx[]={-1,0,1,0};
        int dy[]={0,1,0,-1};
        while(!q1.isEmpty())
        {
            int w_row=q1.peek().row;
            int w_col=q1.peek().col;
            int w_time=q1.peek().time;
            m_time=Math.max(m_time,w_time);
            q1.poll();
            for(int i=0;i<4;i++)
            {
                int n_row=w_row+dx[i];
                int n_col=w_col+dy[i];
                if(n_row>=0 && n_col >=0 && n_row<r_size && n_col<c_size 
                && vis[n_row][n_col]==0 && grid[n_row][n_col]==1)
                {
                    q1.add(new Pair(n_row,n_col,w_time+1));
                    vis[n_row][n_col]=2;
                    fresh_to_rotten++;


                }
            }
        }
        

        if(fresh_oranges!=fresh_to_rotten) return -1;

        return m_time;
        
    }
}