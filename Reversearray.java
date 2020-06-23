package level1;

import java.util.*;

public class Reversearray {
	public int[] solution(long n) {
		int[] answer = {};
		String s = Long.toString(n);                       //Long n을 string으로 변환
		
		answer = new int[s.length()];                      //n의 길이만큼의 배열 생성
		for (int i =0; i<s.length(); i++) {                
			String s1 = ""+s.charAt((s.length()-i)-1);     //s1에 s에 들어온 숫자를 charAt로 뒤에값부터 넣어줌
			answer[i] = Integer.parseInt(s1);              //answer에 그 결과를 다시 숫자로 넣어줌
		}
		return answer;			
	}
	
	public static void main(String[] args) {
		Reversearray r = new Reversearray();
		
		int []result = r.solution(12345);
		
		System.out.println(Arrays.toString(result));
	}
}
	


