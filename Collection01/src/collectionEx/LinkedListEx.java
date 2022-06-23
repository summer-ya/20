package collectionEx;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<Language> list = new LinkedList<Language>();
		
		list.add(new Language("java",100));
		list.add(new Language("python", 90));
		list.add(new Language("dart", 80));
		list.add(new Language("kotlin", 70));
		list.add(new Language("C++", 60));
		
		list.set(4, new Language("c#", 60));
		list.remove(2);
		
		for(Language a : list) {
			System.out.println(a.name + "\t" + a.score);
		}
	}

}
