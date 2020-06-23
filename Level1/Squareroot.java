package level1;

import java.util.*;

public class Squareroot {
	 public long solution(long n) {
	        long answer = 0;
	        
	        if (n== (long)Math.pow((long)Math.sqrt(n),2)) {                         //if n값이 Math.pow(Math.sqrt(n),2)한 값과 같을 때
	        	                                                                    //Math.pow(Math.sqrt(n),2)는 n을 루트씌었을때 값을 다시 제곱한것.
	        	return answer =(long)Math.pow((long)Math.sqrt(n)+1,2);              //만약 그 값이 n과 같다면 1을 더해줘서 제곱한다.
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

