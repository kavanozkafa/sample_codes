import java.util.Scanner;
 
public class Sort_Merge {
	
	public static void main(String args[]) {
		
		int n;
		int[] num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Merge Sort");
		
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
		
		// Merge Sort Event..
		MergeSort(num, 0, n-1);
		
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
 
	private static void MergeSort(int[] num, int i, int j) {
		
		int low = i;
		int high = j;
		
		if (low >= high) {
			
			return;
		}
 
		int middle = (low + high) / 2;
		
		MergeSort(num, low, middle);
		MergeSort(num, middle + 1, high);
		
		int end_low = middle;
		int start_high = middle + 1;
		
		while ((low <= end_low) && (start_high <= high)) {
			
			if (num[low] < num[start_high]) {
				
				low++;
			} 
			else {
				
				int Temp = num[start_high];
				
				for (int k = start_high- 1; k >= low; k--) {
					
					num[k+1] = num[k];
				}
				
				num[low] = Temp;
				low ++;
				end_low ++;
				start_high ++;
			}
		}
	}
}