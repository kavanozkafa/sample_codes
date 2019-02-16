import java.util.Scanner;
 
public class Sort_Selection {
	
	int numbers[] = null;
	int n = 0;
	
	Scanner scan = new Scanner(System.in);
	
	void getNumbers() {
		
		System.out.println("Selection Sort");
		System.out.println("\nEnter n value :");
		n = Integer.parseInt(scan.nextLine());
		
		numbers = new int[n];
		
		System.out.println("Enter the Numbers :");
		
		for(int i=0; i<n; i++) {
			
			numbers[i] = Integer.parseInt(scan.nextLine());
		}
	}
	
	void SelectionSort() {
		
		System.out.println("\nBefore Sorting :");
		
		for(int i=0; i<n; i++) {
			
			System.out.print(numbers[i] + " ");
		}
		
		/* Selection Sort Code Start */
 
		for(int i=0; i<n; i++) {
			
			int index_of_min = i;
			
			for(int j=i; j<n; j++) {
				
				if(numbers[index_of_min] > numbers[j]) {
					
					index_of_min = j;
				}
			}
			
			int temp = numbers[i];
			numbers[i] = numbers[index_of_min];
			numbers[index_of_min] = temp;
		}
		
		/* Selection Sort Code End */
 
		System.out.println("\n \nAfter Sorting");
		System.out.println("\nAscending Order :");
 
		for(int i=0; i<n; i++) {
			
			System.out.print(" " + numbers[i]);
		}
		
		System.out.println("\nDescending Order :");
 
		for(int i=n-1; i>=0; i--) {
			
			System.out.print(" " + numbers[i]);
		}
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		Sort_Selection obj = new Sort_Selection();
		
		obj.getNumbers();
		obj.SelectionSort();
	}
}