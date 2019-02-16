import java.util.Scanner;
 
public class Sort_Heap {
	
	public static void main(String args[]) {
	
		int n;
		int num[];
		Scanner scan = new Scanner(System.in);		
 
		System.out.println("Heap Sort");
		
		System.out.println("\nEnter 'n' value :");
		n = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter the numbers :");
		
		num = new int[n];
 
		for(int i=0; i<n; i++) {
			num[i] = Integer.parseInt(scan.nextLine());
		}
		
		System.out.println("\nBefore Sorting");
		
		for(int i=0; i<n; i++) {
			
			System.out.print(" " + num[i]);
		}
		
		System.out.println("\n\nAfter Sorting");
 
		for(int i=n; i>1; i--) {
			
			HeapSort(num, i - 1);
		}
		
		System.out.println("\nAscending Order");
 
		for(int i=0; i<n; i++) {
			
			System.out.print(" " + num[i]);
		}
		
		System.out.println("\nDescending Order");
 
		for(int i=n-1; i>=0; i--) {
			
			System.out.print(" " + num[i]);
		}
	}
 
	private static void HeapSort(int array[], int bound) {
		
		int left, right, middle, root, temp;
		root = (bound-1) / 2;
		
		for(int i=root; i>=0; i--) {
			
			for(int j=root; j>=0; j--) {
				
				left = (2*j) + 1;
				right = (2*j) + 2;
				
				if((left <= bound) && (right <= bound)) {
					
					if(array[right] >= array[left])
						middle = right;
					else
						middle = left;
				}
				else {
					
					if(right > bound)
						middle = left;
					else
						middle = right;
				}
 
				if(array[j] < array[middle]) {
					
					temp = array[j];
					array[j] = array[middle];
					array[middle] = temp;
				}
			}
		}
		
		temp = array[0];
		array[0] = array[bound];
		array[bound] = temp;
	}
}