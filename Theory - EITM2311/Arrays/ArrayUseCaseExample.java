		
		
		import java.util.*;

		public class ArrayUseCaseExample {
			public static void main(String args[]) {
		   String student_1 = "Ali";
		   String student_2 = "Saeed";
		   String student_3 = "Foad";
		   String [] students = {"Ali", "Saeed", "Foad"};
		 
		   System.out.println("******************"); //Output ******************
		   System.out.println(student_1); //Output Ali
		   System.out.println(student_2); //Output Saeed
		   System.out.println(student_3); //Output Foad
		   
		   System.out.println("******************"); //Output ******************
			  for(String s : students){
			   System.out.print(s + "\t"); //Output Ali	Saeed	Foad
		   }

			}
		}
		
		                               