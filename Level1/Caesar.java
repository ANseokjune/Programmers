package level1;

public class Caesar {
	public String solution(String s, int n) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLowerCase(ch)) {
				ch = (char) ((ch + n % 26 - 'a') % 26 + 'a');
			} else if (Character.isUpperCase(ch)) {
				ch = (char) ((ch + n % 26 - 'A') % 26 + 'A');
			}
			answer += ch;
		}

		return answer;
	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		String a = "AB";
		String b = "z T r";
		String result1 = c.solution(a, 2);
		String result2 = c.solution(b, 5);

		System.out.println(result1);
		System.out.println(result2);
	}
}
