	
	
	import java.util.*;

	public class ArraysTraversal {
		public static void main(String args[]) {
			
	   String [] students = {"Hassan", "Anas", "Khadija"};
	   String [] courses = new String [5]; //All initialized with NULL 
	   
	   for(int i =0; i< students.length; i++){
		   System.out.print(students[i] + "\t"); //Output Hassan	Anas	Khadija	
	   }
	   
	   System.out.println("\n"+ students.length); //Output 3
	   System.out.println(courses.length); //Output 5
	   
	   System.out.println(Arrays.asList(courses).size()); //Output 5
	   
	   for (String s: courses){
			System.out.print(s + "\t"); //Output NULL NULL NULL NULL NULL
	   }
	   
	   
		}
	}
	
	
	