	
	import java.util.Arrays;
	  
	public class ArrayDeleteOperation {
	  		// Function to remove the element
		public static int[] deleteArrayElement(int[] array, int index)
		{
	   //You cannot delete an item if array is null or index less than Zeroor index larger than the length
			if (array == null || index < 0 || index >= array.length) {
	  			return array; //do nothing
			}
	  		// Create another array of size one less than original array
			int[] anotherArray = new int[array.length - 1];
	  	// Copy the elements except the index from original array to the other array
			for (int i = 0, k = 0; i < array.length; i++) {
	  				if (i == index) {
					continue;
				}
	  
				anotherArray[k++] = array[i];
			}
			// return the new array
			return anotherArray;
		}
	  	 
		public static void main(String[] args)
		{
			int[] array = { 5, 6, 7, 8, 9 };
	  
			System.out.println("Array items: " + Arrays.toString(array));
	  		int index = 2;
	  		System.out.println("Index to be removed: " + index);
	  		// Remove the element
			array = deleteArrayElement(array, index);
	  		// Print the new array
			System.out.println("Array after deletion: "
							   + Arrays.toString(array));
		}
	}
	
	