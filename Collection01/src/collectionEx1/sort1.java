package collectionEx1;

import java.util.Arrays;

public class sort1 {
	public static void main(String[] args) {
		
		int[] arr = {3, 8, 42,93,77,35,25,88};
		Arrays.sort(arr);
		
		for(int i : arr) {
			System.out.print("["+i+"]");
		}
	}
}