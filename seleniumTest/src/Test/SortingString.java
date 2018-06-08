package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortingString {

	public static void main(String[] args) {
		
		
		String s1="ababcdfeegfcg";
		char[] s1array=s1.toCharArray();
		int size=s1array.length;
		Set<Character> uniquecharacter=new HashSet<>();
		   for(int i=0;i<size;i++)
		{
			   for(int j=i;j<size-1;j++)
			   {
				   
			if(s1array[i]==s1array[j+1])
			{	
				
			uniquecharacter.add(s1array[i]);
		
			}  }
		}
		   
		   System.out.println("commonchahacter  "+uniquecharacter.toString());

	Map<String,String> map=new HashMap<>();
	map.put("1", "Manjari");
	map.put("2", "Ankita");
	map.put("3", "Sweta");
	map.put("4","Sajida");
	Set keys=map.keySet();
    Collection<String> val=map.values();
	System.out.println("KeySet is"+keys);
	System.out.println("Vlaues are is"+val);
	map.remove("3");
	System.out.println("KeySet is"+map.keySet());
	ArrayList<String> names=new ArrayList<>();
	List<Integer> ids=new ArrayList();
	ids.add(10);
	ids.add(2);
	ids.add(1);
	ids.add(76);
	ids.add(34);
	
	Collections.sort(ids);
	for(int id:ids)
		System.out.print(" "+id);
	
	String[] family={"Sikandar","Rinki","Shastri"};
	names.add("Manjari");
	names.add("Amrendra");
	names.add("Avyaan");
	names.add("Viraaj");
	
	Collections.sort(names);
	Arrays.sort(family);
	
	System.out.println("  Print sorted names"+names);
	
	for(String n1:family)
	System.out.print(n1+" ");

	}

}
