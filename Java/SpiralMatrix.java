import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<Integer>();
		if (matrix != null && matrix.length != 0) {
			int r = 0;
			int c = 0;
			int R = matrix.length;
			int C = matrix[0].length;
			while (r < R && c < C) {

				for (int i = c; i < C; i++)
					list.add(matrix[r][i]);

				r++;

				for (int j = r; j < R; j++)
					list.add(matrix[j][C - 1]);

				C--;

				if (r < R) {
					for (int i = C - 1; i >= c; i--)
						list.add(matrix[R - 1][i]);
					R--;
				}

				if (c < C) {
					for (int j = R - 1; j >= r; j--)
						list.add(matrix[j][c]);

					c++;
				}
			}
		}
		return list;
	}
}