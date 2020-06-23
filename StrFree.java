package level1;

import java.util.*;

public class StrFree {
	public String[] solution(String[] strings, int n) {

		String[] answer = {};
		answer = new String[strings.length];

		for (int i = 0; i < strings.length; i++) {
			String addOn = strings[i].substring(n, n + 1);
			strings[i] = addOn + strings[i];
		}

		Arrays.sort(strings);

		for (int i = 0; i < strings.length; i++) {
			answer[i] = strings[i].substring(1);
		}

		return answer;
	}

	public static void main(String[] args) {
		StrFree s = new StrFree();
		String[] a = { "sun", "bed", "car" };
		int n = 1;

		String[] result = s.solution(a, n);
		System.out.println(Arrays.toString(result));

	}

}
