package level1;

import java.util.*;

public class Reversearray {
	public int[] solution(long n) {
		int[] answer = {};
		String s = Long.toString(n);                       //Long n�� string���� ��ȯ
		
		answer = new int[s.length()];                      //n�� ���̸�ŭ�� �迭 ����
		for (int i =0; i<s.length(); i++) {                
			String s1 = ""+s.charAt((s.length()-i)-1);     //s1�� s�� ���� ���ڸ� charAt�� �ڿ������� �־���
			answer[i] = Integer.parseInt(s1);              //answer�� �� ����� �ٽ� ���ڷ� �־���
		}
		return answer;			
	}
	
	public static void main(String[] args) {
		Reversearray r = new Reversearray();
		
		int []result = r.solution(12345);
		
		System.out.println(Arrays.toString(result));
	}
}
	


