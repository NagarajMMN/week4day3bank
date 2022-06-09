package week4day3Assign;

import java.util.HashSet;
import java.util.Set;

public class PrintOnlyUnique {
	public static void main(String[] args) {
		String in = "babub";
		char[] ch = in.toCharArray();
		System.out.println("the length is: "+in.length());
		
	Set<Character> set=new HashSet<Character>();
	for (int i = 0; i < ch.length; i++) {
	set.add(ch[i]);
	}
	System.out.println(set);
		
	}
	

}
