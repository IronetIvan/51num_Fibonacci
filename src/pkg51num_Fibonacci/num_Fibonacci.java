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
        int fib1 = 0, fib2 = 1, cont = 0;
		
		System.out.print(fib1 + " " + fib2 + " "); 

		do{ 
			int cur = fib1 + fib2; 
			fib1 = fib2; 
			fib2 = cur; 
			System.out.print(cur + " \n");
			
			cont++;
		}while(cont < 50); 

	}

}