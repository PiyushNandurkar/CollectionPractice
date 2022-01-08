
package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesInArrayList {
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,3,2,1,5,4,4,5,6,7,8,9,10));
		
		/*1. LinkedHashSet We know that we cannot have duplicates in Linked hash set*/
		LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> numbersListwithoutDuplicate=new ArrayList<Integer>(linkedHashSet);
		System.out.println("Using Linked Hash Set : "+numbersListwithoutDuplicate);
		
		//2. JDK Streams
		ArrayList<Integer> ranks=new ArrayList<Integer>(Arrays.asList(1,2,3,3,2,1,5,4,4,5,6,7,8,9,10));
		List<Integer> uniqueRanks=ranks.stream().distinct().collect(Collectors.toList());
		System.out.println("Using Streams : "+uniqueRanks);
	}

}

