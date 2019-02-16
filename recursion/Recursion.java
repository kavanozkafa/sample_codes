/*Recursion algoritmasýnýn temel prensibi kendini çalýþtýrmadýr.yani
 * kendisinin çalýþmasý için ayný  metodun bir önceki input ile çalýþmasýný gerektirir.
 * factorial'de olduðu gibi.veya fibonacci serisi gibi
 *  

*/
 

public class Recursion {

	//factorial
	static int factorial(int n){      
          if (n == 1)      
            return 1;      
          else      
            return(n * factorial(n-1));      
    }  
	
	//fibonacci
	static int n1=0,n2=1,n3=0;      
    static void printFibo(int count){      
       if(count>0){      
            n3 = n1 + n2;      
            n1 = n2;      
            n2 = n3;      
            System.out.print(" "+n3);     
            printFibo(count-1);      
        }      
    }       

	public static void main(String[] args) {
		System.out.println("hello"); 
		
		//factorial
		System.out.println("Factorial of 5 is: "+factorial(5));  

		
		// Fibonacci 
	    int count=15;      
	      System.out.print(n1+" "+n2);//printing 0 and 1      
	      printFibo(count-2);//n-2 because 2 numbers are already printed 
	}

}
  
  
