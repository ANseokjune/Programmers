package level1;

import java.util.*;

public class Nnum {
	
	    public long[] solution(int x, int n) {
	        long[] answer = new long[n];       //n의 크기의 배열을 만들고
	        for(int i=1; i<=n; i++){           //i는 1부터 n번까지 for문으로 돌려서
	           answer[i-1] = x*i;              //x가 2, n이 5면 2*1, 2*2, 2*3, 2*4, 2*5 의 값을 answer 배열에 넣어주기
	        }
	        return answer;
	    }
	
	public static void main(String[] args) {
		Nnum n = new Nnum();
		
		long[] result = n.solution(2,5);
		
		System.out.println(Arrays.toString(result));
	}

}
