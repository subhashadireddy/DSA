
import java.util.*;

public class all_possible_paths_Dfs {

    static void DFSearch(int s, List<List<Integer>> g, boolean[] visited,List<Integer> path, int d) {

        visited[s] = true;
        path.add(s);

        if (s == d) {
            System.out.println(path);
        } else {
            for (int i : g.get(s)) {
                if (!visited[i]) {
                    DFSearch(i, g, visited, path, d);
                }
            }
        }
        path.remove(path.size() - 1);
        visited[s] = false;
    }

    public static void main(String[] args) {

        int[][] a = {
            {0, 1}, {0, 2}, {0, 3},
            {3, 2}, {1, 3}, {2, 4}, {3, 4}
        };

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

        boolean[] visited = new boolean[5];

        DFSearch(0, g, visited, new ArrayList<>(), 2);
    }
}
