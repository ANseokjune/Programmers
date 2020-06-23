package level1;

public class Nsum {

	public int solution(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) { // n을 i로 나눈 나머지가 0이면 약수지
			if (n % i == 0) {
				sum += i; // 그 i값을 sum 에다가 더하고
			}
		}
		return sum; // 출력해보리기

	}

	public static void main(String[] args) {
		Nsum s = new Nsum();

		int result = s.solution(12);

		System.out.println(result);

	}
}
