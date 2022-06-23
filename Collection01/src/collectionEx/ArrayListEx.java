package collectionEx;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("python");
		list.add("dart");
		list.add("kotlin");
		list.add("c++");
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();
		
		list.set(0, "JAVA");
		list.remove(4);
		
		for(String s : list) {
			System.out.print(s + " ");
		}
	}

}
