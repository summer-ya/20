package collectionEx;

import java.util.Vector;

public class Vector_Ex {
	public static void main(String[] args) {
		Vector<Vector_first> list = new Vector<Vector_first>();
		
		list.add(new Vector_first("java",100));
		list.add(new Vector_first("pyhyon",90));
		list.add(new Vector_first("dart", 80));
		list.add(new Vector_first("kotln", 70));
		list.add(new Vector_first("C++", 60));
		
		list.set(4,  new Vector_first("c#", 60));
		list.remove(2);
		
		for(Vector_first a : list) {
			System.out.println(a.name + "\t" + a.score);
		}
		
		
	}



}


