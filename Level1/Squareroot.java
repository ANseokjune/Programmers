package level1;

import java.util.*;

public class Squareroot {
	 public long solution(long n) {
	        long answer = 0;
	        
	        if (n== (long)Math.pow((long)Math.sqrt(n),2)) {                         //if n���� Math.pow(Math.sqrt(n),2)�� ���� ���� ��
	        	                                                                    //Math.pow(Math.sqrt(n),2)�� n�� ��Ʈ�������� ���� �ٽ� �����Ѱ�.
	        	return answer =(long)Math.pow((long)Math.sqrt(n)+1,2);              //���� �� ���� n�� ���ٸ� 1�� �����༭ �����Ѵ�.
	        }
	        	else {
	        		return -1;
	        	}
	        		
	        }
	 public static void main(String[] args) {
		 Squareroot s = new Squareroot();
		 
		 long result = s.solution(121);
		 
		 System.out.println(result);
	 }
}

