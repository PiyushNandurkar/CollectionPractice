package arrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistCompare {
	
	
	public static void main(String[] args) {
		ArrayList<String> l1=new ArrayList<String>(Arrays.asList("a","b","c","d","e"));
		ArrayList<String> l2=new ArrayList<String>(Arrays.asList("a","c","b","d","e")) ;
		
		//Using sort and Equals:
		System.out.println(l1.equals(l2));
		Collections.sort(l1);
		Collections.sort(l2);
		System.out.println(l1.equals(l2));
		
		//Compare 2 list and Find out additional Elements  
		ArrayList<String> l3=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l4=new ArrayList<String>(Arrays.asList("A","C","E","D","G")) ;
		
		//l3.removeAll(l4);
		System.out.println(l3);
		
		//FindOut Missing Element
		//l4.removeAll(l3);
		System.out.println(l4);
		
		//Findout common Element
		ArrayList<String> lang1=new ArrayList<String>(Arrays.asList("Java","Pearl","C++"));
		ArrayList<String> lang2=new ArrayList<String>(Arrays.asList("Java","C#","Python"));
		lang1.retainAll(lang2);
		System.out.println(lang1);
		
	}
	
	
}


