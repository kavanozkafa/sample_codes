/*
 * 
 Insertion Sort algoritmas� O(n^2)
 
 
  dizinin ba��ndan ba�la
  uygun olan yere veriyi sok
  sonuna kadar bunu s�ral� �ekilde uygula
  
  insertion sort s�ral� verileri her ad�mda daha da geni�letir.
  �ok elemanla daha uygundur.
  selection sort insertion sorta g�re daha az atama i�lemi yaparken daha �ok kar��la�t�rma i�lemi yapar.
  bu nedenle selection sort az elemanl� diziler i�in uygun.
  
 veriler s�ral� ise O(n)
 ortalama O(n^2)
 worst O(n^2) 
 */




import java.util.Scanner;

public class InsertionSort {
	
	int numbers[] = null;
	int n = 0;
	
	Scanner scan = new Scanner(System.in);
	
	void getNumbers() {
		
		System.out.println("Insertion Sort");
		System.out.println("Enter n value :");
		n = Integer.parseInt(scan.nextLine());
		
		numbers = new int[n];
		
		System.out.println("Enter the Numbers :");
		
		for(int i=0; i<n; i++) {
			
			numbers[i] = Integer.parseInt(scan.nextLine());
		}
	}
	
	void Insertion_Sort() {
		
		System.out.println("\nBefore Sorting :");
		
		for(int i=0; i<n; i++) {
			
			System.out.print(numbers[i] + " ");
		}
		
		/* Insertion Sort Code Start */
 
		for (int i = 1; i < n; i++) {
			
			int j = i;
			int B = numbers[i];
			
			while ((j > 0) && (numbers[j-1] > B)) {
				
				numbers[j] = numbers[j-1];
				j--;
			}
			
			numbers[j] = B;
		}
		
		/* Insertion Sort Code End */
 
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
	
	public static void main(String args[]) {
		
		InsertionSort obj = new InsertionSort();
		
		obj.getNumbers();
		obj.Insertion_Sort();
	}
}