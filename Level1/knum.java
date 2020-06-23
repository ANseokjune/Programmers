package level1;

import java.util.Arrays;

public class knum {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int[] temp = new int[commands[i][1] - commands[i][0] + 1];
			int k = 0;

			for (int j = commands[i][0]; j <= commands[i][1]; j++)
				temp[k++] = array[j - 1];

			Arrays.sort(temp);

			answer[i] = temp[commands[i][2] - 1];
		}
		return answer;
	}
	public static void main(String[] args) {
		knum n = new knum();
		int[] d = { 1,5,2,6,3,7,4 };
		int[][] c = {{2,5,3},{4,4,1},{1,7,3}};
		int [] r = n.solution(d, c);
		
		System.out.println(Arrays.toString(r));

	}

}
