
public class BubbleSorting {
	
	 void bubbleSorting(int array[])
	 {
	     int num = array.length;
	     for (int i = 0; i < num-1; i++)
	         for (int j = 0; j < num-i-1; j++)
	             if (array[j] > array[j+1])
	             {
	                 
	                 int temp = array[j];
	                 array[j] = array[j+1];
	                 array[j+1] = temp;
	             }
	 }

	
	 void printArray(int array[])
	 {
	     int n = array.length;
	     for (int i=0; i<n; ++i)
	         System.out.print(array[i] + " ");
	     System.out.println();
	 }

	 
	public static void main(String[] args) {
		BubbleSorting ob = new BubbleSorting();
	     int array[] = {80, 20, 15, 21, 55, 11, 70};
	     ob.bubbleSorting(array);
	     System.out.println("Sorted array");
	     ob.printArray(array);

	}
}
