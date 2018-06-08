package Test;

import java.util.HashSet;
import java.util.Set;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1 = "abc";
	        String s2 = "bcd";

	        Set<Character> set1 = new HashSet<Character>();
	        Set<Character> set2 = new HashSet<Character>();

	        for(char c : s1.toCharArray()) {
	            set1.add(c);
	        }
	        for(char c : s2.toCharArray()) {
	            set2.add(c);
	        }

	        // Stores the intersection of set1 and set2 inside set1
	        //set1.retainAll(set2);
	        set1.removeAll(set2);
	        //set2.removeAll(set1);
	        for(char c : set1) {
	            System.out.print(" " + c);
	        }
	        for(char c : set2) {
	            //System.out.print(" " + c);
	        }
	        System.out.println("\nTotal number of common characters: "
	            + set1.size());
	}

}
