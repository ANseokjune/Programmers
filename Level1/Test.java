package level1;

import java.util.*;

public class Test {
	public int[] solution(int[] answers) {
		int[] answer = {};
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] c = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int cnta = 0;
		int cntb = 0;
		int cntc = 0;

		for (int i = 0; i < answers.length; i++) {
			if (a[i % a.length] == answers[i])
				cnta++;
			if (b[i % b.length] == answers[i])
				cntb++;
			if (c[i % c.length] == answers[i])
				cntc++;
		}
		int max = Math.max(Math.max(cnta, cntb), cntc); // max값 구하기
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (max == cnta)
			list.add(1); // max값이랑 같으면 넣는다.
		if (max == cntb)
			list.add(2);
		if (max == cntc)
			list.add(3);

		answer = new int[list.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		Test t = new Test();
		int[] a = { 1, 2, 3, 4, 5 };
		int[] r = t.solution(a);

		System.out.println(Arrays.toString(r));

	}
}
