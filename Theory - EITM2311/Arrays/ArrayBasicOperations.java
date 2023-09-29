import java.util.*;

public class ArrayBasicOperations {
    public static void main(String args[]) {
  
   
   String [] students =  new String [3]; // {"Ali", "Saeed", "Foad"};
    
   students[0] = "Ali";
   students[1] = "Saeed";
   students[2] = "Foad";
    for(int i= 0; i< students.length; i++){
        System.out.print(students[i] + "\t"); //Output Ali	Saeed	Foad	
        //Remove Saeed - Must check if value is null, otherwise, you get an execption
        if(students[i] != null && students[i].equals("Saeed")){
            //You can also remove the element and change the size of the array .. 
            students[i] = null;
        }
        //Update Foad Name - Must check if value is null, otherwise, you get an execption
        if(students[i] != null && students[i].equals("Foad")){
            students[i] = "Foaad";
        }
    }
    
    for(String s: students){
        System.out.print(s + "\t"); //Output Ali	null	Foaad
    }
    }
}