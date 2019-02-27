/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg51num_Fibonacci;

/**
 *
 * @author irone
 */
public class num_Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fib1 = 0;
	int fib2 = 1;
	int cont = 0;
		
		System.out.print(fib1 + " " + fib2 + " "); 

		do{ 
			int resul = fib1 + fib2; 
			fib1 = fib2; 
			fib2 = resul; 
			System.out.print(resul + " \n");
			
			cont++;
		}while(cont <= 51); 

	}

}
