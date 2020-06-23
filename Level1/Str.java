package level1;

public class Str {
	 public boolean solution(String s) {
	        boolean answer = true;
	        String [] a = s.split("");
	        
	        if(s.length()==4 || s.length() == 6) {
	        	try {
	        		Integer.parseInt(s);
	        		return answer;
	        	}catch (NumberFormatException e) {
	        		return false;
	        	}
	        }else {
	        	return false;
	        }
	        
	    }
	 
	 public static void main(String[] args) {
		 Str t = new Str();
		 String b = "a234";
		 String c = "1234";
		 
		 boolean result = t.solution(b);
		 boolean result2 = t.solution(c);
		 
		 System.out.println(result);
		 System.out.println(result2);
	 }

}
