package level1;

public class Nsum {

	public int solution(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) { // n�� i�� ���� �������� 0�̸� �����
			if (n % i == 0) {
				sum += i; // �� i���� sum ���ٰ� ���ϰ�
			}
		}
		return sum; // ����غ�����

	}

	public static void main(String[] args) {
		Nsum s = new Nsum();

		int result = s.solution(12);

		System.out.println(result);

	}
}
