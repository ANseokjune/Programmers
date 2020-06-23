package level1;

public class EvenOdd {
	public String solution(int num) {
		String answer = "";
		if (num % 2 == 0) { // 2로 나눈 나머지가 0이면, 즉, 짝수면
			return answer = "Even"; // Even 출력
		} else {
			return answer = "Odd"; // 홀수면 Odd출력
		}
	}

	public static void main(String[] args) {
		EvenOdd e = new EvenOdd();

		String result = e.solution(3);

		System.out.println(result);
	}
}
