package level1;

import java.util.*;

public class StringDesc {
	public String solution(String s) {
		String[] array = s.split("");
		Arrays.sort(array);
		Collections.reverse(Arrays.asList(array));
		return String.join("", array);
	}

	public static void main(String[] args) {
		StringDesc d = new StringDesc();
		String a = "Zbcdefg";
		String result = d.solution(a);

		System.out.println(result);

	}

}
