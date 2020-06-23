package level1;

import java.util.*;

public class Nnum {
	
	    public long[] solution(int x, int n) {
	        long[] answer = new long[n];       //n�� ũ���� �迭�� �����
	        for(int i=1; i<=n; i++){           //i�� 1���� n������ for������ ������
	           answer[i-1] = x*i;              //x�� 2, n�� 5�� 2*1, 2*2, 2*3, 2*4, 2*5 �� ���� answer �迭�� �־��ֱ�
	        }
	        return answer;
	    }
	
	public static void main(String[] args) {
		Nnum n = new Nnum();
		
		long[] result = n.solution(2,5);
		
		System.out.println(Arrays.toString(result));
	}

}
