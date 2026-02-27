public class graph{
    public static void main(String[] args)
    {
        int [][] g = {{0,1},{1,2},{2,3},{3,4},{4,2}};
        int [][] a = new int[5][5];
        for(int i=0;i<g.length;i++)
        {
            a[g[i][0]][g[i][1]] = 1;
            a[g[i][1]][g[i][0]] = 1;
        }
        for(int [] row : a){
            for(int element: row){
                System.out.print(element+" ");
            }
            System.out.println(" ");
        }
    }
}
