package level1;

import java.util.*;

public class Divisor {

	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		ArrayList<Integer> a1 = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0)
				a1.add(arr[i]);
		}

		if (a1.isEmpty()) {
			a1.add(-1);
		}

		answer = new int[a1.size()];

		for (int i = 0; i < a1.size(); i++) {
			answer[i] = a1.get(i);
		}

		Arrays.sort(answer);

		return answer;
	}

	public static void main(String[] args) {
		Divisor d = new Divisor();
		int[] arr = { 5, 9, 7, 10 };
		int x = 5;
		int[] r = d.solution(arr, x);

		System.out.println(Arrays.toString(r));
	}
}
