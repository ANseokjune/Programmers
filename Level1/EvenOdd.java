package level1;

public class EvenOdd {
	public String solution(int num) {
		String answer = "";
		if (num % 2 == 0) { // 2�� ���� �������� 0�̸�, ��, ¦����
			return answer = "Even"; // Even ���
		} else {
			return answer = "Odd"; // Ȧ���� Odd���
		}
	}

	public static void main(String[] args) {
		EvenOdd e = new EvenOdd();

		String result = e.solution(3);

		System.out.println(result);
	}
}
