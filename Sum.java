package level1;

import java.util.*;

public class Sum {
	public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);                 //int n�� string���� �ٲ���.
        
        for (int i = 0 ; i < s.length(); i++) {
        	answer += Integer.parseInt(s.charAt(i)+""); //Integer.parseInt�� ����ؼ� stringŸ���� ���ڸ� int�� ���� �ٲ���
        	                                            //charAt�� ����ؼ� �ε��� ��ġ�� �ش�Ǵ� ���� ����
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Sum s1 = new Sum();
		
		int result = s1.solution(123);
		System.out.println(result);
		
	}
}

