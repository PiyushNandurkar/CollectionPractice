package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("Java");
		arr1.add("Python");
		arr1.add("C#");
		arr1.add("Pearl");
		
		for(int i=0;i<arr1.size();i++){
			System.out.println(arr1.get(i));
		}
		
		ArrayList<String> arr2=new ArrayList<String>();
		arr2.add("Database");
		arr2.add("SQL");
		
		//adds Complete List to List
		arr1.addAll(2,arr2);
		
		System.out.println(arr1);
		
		//Clears Element present in list
		//arr1.clear();
		//System.out.println(arr1);
		
		//Used to clone the Elemnt
		ArrayList<String> cloneList=(ArrayList<String>)arr1.clone();
		System.out.println("CloneList"+cloneList);
		
		//Checks Element is present or not
		System.out.println(arr1.contains("Python"));
		System.out.println(arr1.contains("Java"));
		
		System.out.println(arr1.indexOf("Pearl")>0);//Returns true or False
		
		//Create array list with value
		ArrayList<String> list1=new ArrayList(Arrays.asList("Piyush","Sam","Rohan","Gauri"));
		//REturns last Index of perticular Element
		int i=list1.lastIndexOf("Rohan");
		System.out.println(i);
		
		//Remove using index
		list1.remove(2);
		System.out.println(list1);
		
		//REmove using Value
		list1.remove("Piyush");
		System.out.println(list1);
		
		ArrayList<Integer> numb=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numb.removeIf(num -> num%2==0);
		//Lamda Expression
		System.out.println(numb);
		
		//ArrayList<String> nameList=new ArrayList(Arrays.asList("Apple","BAll","CAt","Dog","Elephant"));
		//System.out.println(nameList);
		//nameList.retainAll(Collections.singleton());
		
		//CreateSublist
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		ArrayList<Integer> subList=new ArrayList<Integer>(numbers.subList(2, 5));
		System.out.println(subList);
		
		//Convert List to an array
		ArrayList<String> nameList=new ArrayList(Arrays.asList("Apple","BAll","CAt","Dog","Elephant"));
		Object arr[]=nameList.toArray();
		System.out.println(Arrays.toString(arr));
		for(Object o: arr){
			System.out.println((String)o);
		}
		
		
		
		
	}
}
