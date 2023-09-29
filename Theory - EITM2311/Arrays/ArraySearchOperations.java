		
		import java.util.*;

		public class ArraySearchOperation {
			public static void main(String args[]) {
		  
		   
		   String [] students =  {"Ali", "Saeed", "Foad"};
		   int [] grades =  {86, 50, 90, 88, 75, 86};

			
			for(String s: students){
			   if(s.equals("Saeed")){
				   System.out.println ("Found");
			   }
			}
			
			String toCheckValue = "Khaled";
			boolean test = Arrays.asList(students)
						  .contains("Khaled");
		 
				System.out.println("Is " + toCheckValue
								   + " present in the array: " + test);
		}
		}
		
		
		