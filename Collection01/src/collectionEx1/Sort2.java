package collectionEx1;

import java.util.Arrays;
import java.util.Collections;

public class Sort2 {
	public static void main(String[] args) {
		
		String arr[] = {"��", "��", "��", "��", "��"};
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(String i : arr) {
			System.out.print("[" + i + "]");
		}
	}
}
