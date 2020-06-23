package level1;

import java.util.*;

public class Notnum {
	public int[] solution(int[] arr) {

		ArrayList list = new ArrayList();
		int temp = 10;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != temp) {
				list.add(arr[i]);
				temp = arr[i];
			}

		}
		int[] answer = new int[list.size()];
		for (int j = 0; j < list.size(); j++) {
			answer[j] = (int) list.get(j);
		}
		return answer;
	}

	public static void main(String[] args) {
		Notnum n = new Notnum();
		int[] d = { 1, 1, 3, 3, 0, 1, 1 };
		int[] r = n.solution(d);

		System.out.println(Arrays.toString(r));

	}
}
