package level1;

import java.util.*;

public class ASC {

	public long solution(long n) {
		long answer = 0;

		String a = "" + n;
		String[] a1 = new String[a.length() + 1];
		a1 = a.split("");
		Arrays.sort(a1);

		for (int i = 0; i < a1.length; i++) {
			answer += Integer.parseInt(a1[i]) * Math.pow(10, i);
		}

		return answer;
	}

	public static void main(String[] args) {
		ASC a = new ASC();
		long b = 118372;
		long result = a.solution(b);
		
		System.out.println(result);
	}

}
