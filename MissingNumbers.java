package week4day3Assign;

import java.util.HashSet;

public class MissingNumbers {

		public static void removeDuplicates(int[] numbers)
				{
				HashSet<Integer> set= new HashSet<Integer>();

    // adding elements to LinkedHashSet
				for (int i = 0; i < numbers.length; i++)
					set.add(numbers[i]);

    // Print the elements of LinkedHashSet
					System.out.print(set);
				}

// Driver code
		public static void main(String[] args)
			{
				int[] numbers= {4,6,7,2,3,1,9,10,8,8,6};
   
				// Function call
				removeDuplicates(numbers);
    
			}
	}
