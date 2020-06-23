package level1;

import java.util.*;

public class Sum {
	public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);                 //int n을 string으로 바꿔줌.
        
        for (int i = 0 ; i < s.length(); i++) {
        	answer += Integer.parseInt(s.charAt(i)+""); //Integer.parseInt를 사용해서 string타입의 숫자를 int형 으로 바꿔줌
        	                                            //charAt를 사용해서 인덱스 위치에 해당되는 문자 추출
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Sum s1 = new Sum();
		
		int result = s1.solution(123);
		System.out.println(result);
		
	}
}

