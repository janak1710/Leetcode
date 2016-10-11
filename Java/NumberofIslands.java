public class NumberofIslands {
	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0)
			return 0;
		int count = 0;
		int R = grid.length;
		int C = grid[0].length;
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (grid[i][j] == '1') {
					count++;
					dfs(grid, i, j);
				}
			}
		}
		return count;
	}

	private void dfs(char[][] grid, int i, int j) {
		int R = grid.length;
		int C = grid[0].length;
		if (i < 0 || i > R - 1 || j < 0 || j > C - 1 || grid[i][j] != '1')
			return;
		grid[i][j] = '0';
		dfs(grid, i - 1, j);
		dfs(grid, i + 1, j);
		dfs(grid, i, j - 1);
		dfs(grid, i, j + 1);

	}
}