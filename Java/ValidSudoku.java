public class ValidSudoku {
	public boolean isValidSudoku(char[][] a) {
		if (!isRowDistinct(a) || !isColDistinct(a))
			return false;

		for (int i = 0; i < 9; i += 3)
			for (int j = 0; j < 9; j += 3)
				if (!isMatrixDistinct(i, j, a))
					return false;

		return true;
	}

	public boolean isRowDistinct(char board[][]) {

		for (int i = 0; i < 9; i++) {
			boolean arr[] = new boolean[10];
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					int no = board[i][j] - '0';
					if (arr[no])
						return false;
					arr[no] = true;
				}
			}
		}
		return true;
	}

	public boolean isColDistinct(char board[][]) {

		for (int j = 0; j < 9; j++) {
			boolean arr[] = new boolean[10];
			for (int i = 0; i < 9; i++) {
				if (board[i][j] != '.') {
					int no = board[i][j] - '0';
					if (arr[no])
						return false;
					arr[no] = true;
				}
			}
		}
		return true;
	}

	public boolean isMatrixDistinct(int x, int y, char board[][]) {
		boolean arr[] = new boolean[10];

		for (int i = x; i < x + 3; i++) {
			for (int j = y; j < y + 3; j++) {
				if (board[i][j] != '.') {
					int no = board[i][j] - '0';
					if (arr[no])
						return false;
					arr[no] = true;
				}
			}
		}
		return true;
	}
}