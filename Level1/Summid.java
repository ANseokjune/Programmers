package level1;

public class Summid {
	public long solution(int a, int b) {
		long answer = 0;

		if (a < b) {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		} else {
			for (int i = b; i <= a; i++) {
				answer += i;
			}

		}

		return answer;
	}
	
	public static void main(String[] args) {
		Summid s = new Summid();
		int x = 3;
		int y = 5;
		long result = s.solution(x, y);
		
		System.out.println(result);
	}

}
