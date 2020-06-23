package level1;

public class Str2 {
	public int solution(String s) {
		int answer = 0;
		answer = Integer.parseInt(s);
		return answer;
	}

	public static void main(String[] args) {
		Str2 t = new Str2();
		String a = "1234";
		int result = t.solution(a);

		System.out.println(result);

	}
}
