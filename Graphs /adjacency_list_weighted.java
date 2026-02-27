import java.util.ArrayList;
import java.util.List;
class Edge{
    int v;
    int w;
    Edge(int v,int w)
    {
        this.v = v;
        this.w = w;
    }
}

public class adjacencylist_weightedgraph {
    public static void main(String[] args){
        int [][]a = {{0,1,2},{0,2,1},{0,3,4},{3,2,1},{1,3,2},{2,4,3},{3,4,2}};
        List<List<Edge>> g = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            g.add(new ArrayList<>());
        }
        for(int i=0;i<a.length;i++)
        {
                int x = a[i][0];
                int y = a[i][1];
                int z = a[i][2];
                g.get(x).add(new Edge(y, z));
                g.get(y).add(new Edge(x, z));
        }
        System.out.println(g);
    }
}
