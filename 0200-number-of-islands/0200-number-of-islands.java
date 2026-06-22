class Pair
{
    int first;
    int second;
    Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}

class Solution {
    int dx[]={0,0,-1,1};
    int dy[]={-1,1,0,0};

    public void bfs(int row_size,int col_size,char [][] grid,boolean[][] vis,int w_row,int w_col)
    {
        
        vis[w_row][w_col]=true;
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(w_row,w_col));
        while(!queue.isEmpty())
        {
            int bfs_row=queue.peek().first;
            int bfs_col=queue.peek().second;
            queue.poll();
            for(int i=0;i<4;i++)
            {
                int new_row=bfs_row+dx[i];
                int new_col=bfs_col+dy[i];
                if(new_row<row_size && new_col<col_size && new_row>=0 && new_col>=0 && vis[new_row][new_col]==false && grid[new_row][new_col]=='1')
                {
                    queue.add(new Pair(new_row,new_col));
                    vis[new_row][new_col]=true;
                }
            }
        }
    }




    public int numIslands(char[][] grid) {
        int island_count=0;
        int row_size=grid.length;
        int col_size=grid[0].length;
        boolean vis[][]=new boolean[row_size][col_size];
        for(int i=0;i<row_size;i++)
        {
            for(int j=0;j<col_size;j++)
            {
                if(grid[i][j]=='1' && vis[i][j]==false)
                {
                    island_count++;
                    System.out.println(island_count);
                    bfs(row_size,col_size,grid,vis,i,j);

                }
            }
        }

        return island_count;
        
    }
}