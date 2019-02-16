/*Bubble sort algortimas�
 * ilk iki say�y� al
 * ald�g�n iki say�y� kar��la�t�r.
 * k���k olan� yaz di�erlerini akl�nda tut.
 * dizinin sonuna geldiyse akl�ndaki say�y� diziye yazark bitir
 * dizinin sonu de�ilse yeni bir say� al.
 * 2. ad�ma geri git.
 * 
 * (n-1) iteratiftir.her iterasyonda n-1 kar��la�t�rma yap�l�r.
 * toplam kar��la�t�rma n^2 - 2n -1 dir. notasyonu O(n^2)
 * best case =n -dizi s�ral�ysa
 * avg. case =(n^2)/2 -random
 * worst case=n^2 -dizi ters s�ral�ysa
 * 
 psedocode
 
 begin BubbleSort(list)
 	for all elemens of list
 		if list[i]>list[i+1]
 			swap(list[i],list[i+1])
 		end if
 	end for
 	
 	return list
 end BubbleSort
 
 
 
 * 
 * */



import java.util.Scanner;

public class BubbleSort {
	
	int numbers[] = null;
	int n = 0;
	
	Scanner scan = new Scanner(System.in);
	
	void getNumbers() {
		
		System.out.println("Bubble Sort");
		System.out.println("\nEnter n value :");
		n = Integer.parseInt(scan.nextLine());
		
		numbers = new int[n];
		
		System.out.println("Enter the Numbers :");
		
		for(int i=0; i<n; i++) {
			
			numbers[i] = Integer.parseInt(scan.nextLine());
		}
	}
	
	void Bubble_Sort() {
		
		System.out.println("\nBefore Sorting :");
		
		for(int i=0; i<n; i++) {
			
			System.out.print(numbers[i] + " ");
		}
		
		/* Bubble Sort Code Start */
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 1; j < (n-i); j++) {
				
				if(numbers[j-1] > numbers[j]) {
					
					int temp = numbers[j-1];
					numbers[j-1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		/* Bubble Sort Code End */
		
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
		
		BubbleSort obj = new BubbleSort();
		
		obj.getNumbers();
		obj.Bubble_Sort();
	}

}
 
