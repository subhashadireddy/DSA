public class graph_weighted {
    public static void main(String[] args) {
        int[][] g = {{0, 1,1}, {1, 2,2}, {2, 3,4}, {3, 4,6}, {4, 2,3}};
        int[][] a = new int[5][5];
        for (int i = 0; i < g.length; i++) {
            a[g[i][0]][g[i][1]] = g[i][2];
            a[g[i][1]][g[i][0]] = g[i][2];
        }
        for (int[] row : a) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(" ");
        }
    }
}
