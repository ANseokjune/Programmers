package level1;

import java.util.Stack;

public class Crain {
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][moves[i] - 1] != 0) {
					if (s.isEmpty())
						s.push(board[j][moves[i] - 1]);
					else {
						if (s.peek() == board[j][moves[i] - 1]) {
							s.pop();
							answer += 2;
						} else {
							s.push(board[j][moves[i] - 1]);
						}
					}
					board[j][moves[i] - 1] = 0;
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Crain c = new Crain();
		int[][] b = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 }, { 3, 5, 1, 3, 1 } };
		int[] m = { 1, 5, 3, 5, 1, 2, 1, 4 };
		int r = c.solution(b, m);

		System.out.println(r);
	}

}
