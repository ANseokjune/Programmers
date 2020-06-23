package level1;

import java.util.Arrays;

public class Budget {

		public int solution(int[] d, int budget) {
			int answer = 0;
			int i = 0;

			Arrays.sort(d);
			for (int b = 0; b < d.length; b++) {
				for (int a = 0; a < d.length; a++) {
					i += d[a];
					if (i <= budget) {
						answer++;
					}
				}

			}
			return answer;
		}

	

	public static void main(String[] args) {
		Budget b = new Budget();
		int [] d= {1,3,2,5,4};
		
		int result = b.solution(d,9);
		
		System.out.println(result);
	}
}
