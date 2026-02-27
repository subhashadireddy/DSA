import java.util.*;

public class sum_of_nodes {

    static int BFSearch(int s, int n, List<List<Integer>> g) {
        boolean[] visited = new boolean[n];
        int sum = 0;   // store sum of nodes

        visited[s] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(s);

        while (!q.isEmpty()) {
            int no = q.poll();
            sum += no;   // add node to sum

            for (int i : g.get(no)) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int[][] a = {{0,1},{0,2},{0,3},{3,2},{1,3},{2,4},{3,4}};
        List<List<Integer>> g = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            g.add(new ArrayList<>());
        }

        for (int i = 0; i < a.length; i++) {
            int x = a[i][0];
            int y = a[i][1];
            g.get(x).add(y);
            g.get(y).add(x);
        }

        int totalSum = BFSearch(0, 5, g);
        System.out.println("Sum of BFS nodes: " + totalSum);
    }
}
