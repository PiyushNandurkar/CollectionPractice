package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArraySynchronization {
	/*What is the diffrence between synchronised array List and NonSynchronised List
	By default ArrayList in not Synchronised there are two ways to synchronise arraylist in java provided byJDK
	1.collections.synchronisedList() -> Returns synchronised ArrayList;
	2.copyOnWriteArrayList  - class available- Threadsafe Varient of ArrayList
	*/
	
	public static void main(String[] args) {
		List<String> namesList=Collections.synchronizedList(new ArrayList<String>());
		namesList.add("Java");
		namesList.add("CSS");
		namesList.add("SpringBoot");
		//add,remove - we dont need explicit synchronisation
		//To fetch and Travers the value from list we have to use Explict Synchronise 
		synchronized (namesList){
			Iterator<String> it=namesList.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}
		
		//2. copyOnWriteArrayList -- Its a Class:
		
		CopyOnWriteArrayList<String> empList=new CopyOnWriteArrayList<String>();
		empList.add("Sham");
		empList.add("Ram");
		empList.add("Premchand");
		
		//We dont need any Synchronisation for any operation to add/remove/traverse
		
		Iterator<String>it=empList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
}
