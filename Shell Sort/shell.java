import java.util.Scanner;
 
public class Sort_Shell {
	
	int numbers[] = null;
	int n = 0;
	
	Scanner scan = new Scanner(System.in);
	
	void getNumbers() {
		
		System.out.println("Shell Sort");
		System.out.println("\nEnter n value :");
		n = Integer.parseInt(scan.nextLine());
		
		numbers = new int[n];
		
		System.out.println("Enter the Numbers :");
		
		for(int i=0; i<n; i++) {
			
			numbers[i] = Integer.parseInt(scan.nextLine());
		}
	}
	
	void ShellSort() {
		
		System.out.println("\nBefore Sorting :");
		
		for(int i=0; i<n; i++) {
			
			System.out.print(numbers[i] + " ");
		}
		
		/* Shell Sort Code Start */
 
		int inner, outer, temp;
		int h = 1;
		
		while (h > 0) {
		
			for (outer = h; outer < n; outer++) {
				
				temp = numbers[outer];
				inner = outer;
 
				while (inner > h - 1 && numbers[inner - h] >= temp) {
					
					numbers[inner] = numbers[inner - h];
					inner -= h;
				}
				
				numbers[inner] = temp;
			}
			
			h = (h - 1) / 3; // decrease h
		}
				
		/* Shell Sort Code End */
 
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
		
		Sort_Shell obj = new Sort_Shell();
		
		obj.getNumbers();
		obj.ShellSort();
	}
}