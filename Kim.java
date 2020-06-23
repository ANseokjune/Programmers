package level1;

import java.util.*;

public class Kim {
	public String solution(String[] seoul) {
        String answer = "";                               //자자 들어보소
        for(int i=0; i<seoul.length; i++){                //seoul 배열의 길이만큼 for문을 돌려서
            if(seoul[i].equals("Kim")){                   //seoul의 i번째 배열값이 kim이면 출력해주세요~
               answer="김서방은 "+i+"에 있다";
            } 
        }
        return answer;
    }
	public static void main(String[] args) {
		Kim k = new Kim();
		String []seoul = {"Jane", "Kim"};
		String result = k.solution(seoul);
		
		System.out.println(result);
	}

}
