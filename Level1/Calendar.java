package level1;

import java.util.Arrays;

public class Calendar {
	  public String solution(int a, int b) {
	      int total = 0;
	      String w[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
	      int m[] = {31, 29, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
	      for(int i =0;i<a-1;i++){
	          total += m[i];
	      }
	      total += b-1;
	      String answer = w[total%7];
	      return answer;
	  }
	  public static void main(String[] args) {
			Calendar c = new Calendar();
			int a = 5;
			int b = 24;
			String r = c.solution(a,b);

			System.out.println(r);

		}

}
