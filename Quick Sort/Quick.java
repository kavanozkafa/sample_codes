import java.util.Scanner;
 
public class Sort_Quick {
	
	public static void main(String args[]) {
	
		int n;
		int num[];
		Scanner scan = new Scanner(System.in);		
 
		System.out.println("Quick Sort");
		
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
		
		// Quick Sort Event..
		QuickSort(num, 0, n-1);
		
		System.out.println("\n\nAfter Sorting");
		
		System.out.println("\nAscending Order");
 
		for(int i=0; i<n; i++) {
			
			System.out.print(" " + num[i]);
		}
		
		System.out.println("\nDescending Order");
 
		for(int i=n-1; i>=0; i--) {
			
			System.out.print(" " + num[i]);
		}
	}
 
	private static void QuickSort(int[] num, int i, int j) {
		
		int low = i;
		int high = j;
		
		if (low >= j) {
			
			return;
		}
		
		int mid = num[(low + high) / 2];
		
		while (low < high) {
			
			while (low<high && num[low] < mid) {
				
				low++;
			}
			
			while (low<high && num[high] > mid) {
				
				high--;
			}
			
			if (low < high) {
				
				int T = num[low];
				num[low] = num[high];
				num[high] = T;
			}
		}
		
		if (high < low) {
			
			int T = high;
			high = low;
			low = T;
		}
		
		QuickSort(num, i, low);
		QuickSort(num, low == i ? low+1 : low, j);
	}
}