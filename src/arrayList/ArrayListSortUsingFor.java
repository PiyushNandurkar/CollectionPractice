package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSortUsingFor {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 1, 2, 3, 4, 2, 1, 3, 4, 3, 5, 6, 6));

		Collections.sort(list);
		System.out.println("Original List : ");
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			for (int j = 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					list.remove(j);
				}
			}
		}
		
		System.out.println("List after duplication removal : ");
		System.out.println(list);

	}
}




