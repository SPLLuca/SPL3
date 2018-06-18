
public class game {

	public static void main(String[] args) {

		int[][] matrix = new int[3][3];

		for (int i = 0; i < 3; i++) {

			for (int k = 0; k < 3; k++) {

				matrix[i][k] = (int) (Math.random() * 2) + 1;

			}
		}
		for (int i = 0; i < 3; i++) {

			for (int k = 0; k < 3; k++) {

				System.out.print(matrix[i][k] + " ");
			}
			System.out.println();
		}

		String winner = winner(matrix);
		if(winner.equals("1")) {
			System.out.println("Winner Spieler 1");
		} else if(winner.equals("2")) {
			System.out.println("Winner Spieler 2");
		} else if(winner.equals("0")) {
			System.out.println("Unentschieden");
		}
		
	}

	public static String winner(int[][] matrix) {

		if (matrix[0][0] == 1 && matrix[1][1] == 1 && matrix[2][2] == 1) {
			return "1";
		}
		if (matrix[0][2] == 1 && matrix[1][1] == 1 && matrix[2][0] == 1) {
			return "1";
		}
		for (int i = 0; i < 3; i++) {
			if (matrix[i][0] == 1 && matrix[i][1] == 1 && matrix[i][2] == 1) {
				return "1";
			}
			if (matrix[0][i] == 1 && matrix[1][i] == 1 && matrix[2][i] == 1) {
				return "1";
			}
		}

		if (matrix[0][0] == 2 && matrix[1][1] == 2 && matrix[2][2] == 2) {
			return "2";
		}
		if (matrix[0][2] == 2 && matrix[1][1] == 2 && matrix[2][0] == 2) {
			return "2";
		}
		for (int i = 0; i < 3; i++) {
			if (matrix[i][0] == 2 && matrix[i][1] == 2 && matrix[i][2] == 2) {
				return "2";
			}
			if (matrix[0][i] == 2 && matrix[1][i] == 2 && matrix[2][i] == 2) {
				return "2";
			}
		}
		return "0";

	}

}
