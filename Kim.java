package level1;

import java.util.*;

public class Kim {
	public String solution(String[] seoul) {
        String answer = "";                               //���� ����
        for(int i=0; i<seoul.length; i++){                //seoul �迭�� ���̸�ŭ for���� ������
            if(seoul[i].equals("Kim")){                   //seoul�� i��° �迭���� kim�̸� ������ּ���~
               answer="�輭���� "+i+"�� �ִ�";
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
