package lesson1;

import java.util.Scanner;

public class ArrayProgramme {

	public static void main(String[] args) {
		/*
		 * this a Programme about addition of two  matrix in which the programme takes input from user
		 * and then perform addition according to the input given by user.
		 * In this programme we have used scanner class, arrays, for loops 
		 */
		System.out.println("This Programme is written by Mr.Abhinendra Singh");
	 Scanner scan = new Scanner (System.in);
	 
	 System.out.println("Enter Dimensions of a matrix");
	 int rows = scan.nextInt();
	 int cols = scan.nextInt();
	 
	 
	 int a [][] = new int [rows][cols];
	 int b [][] = new int [rows][cols];
	 
	 System.out.println("Enter array a");
	 for (int i = 0; i<rows; i++) {
		 for (int j = 0; j<cols; j++) {
		    a[i][j] = scan.nextInt();
		 } 
	 }
	  
	 System.out.println("Enter array b ");
	 for (int i = 0; i<rows; i++) {
		 for (int j = 0; j<cols; j++) {
			
			 b[i][j]=scan.nextInt();
		 }
	 }
	 
			  System.out.println("the result of two matrix is ");
	   
			int c [][]= new int [rows][cols];
			 for (int i = 0; i<rows; i++) {
				 for (int j = 0; j<cols; j++) {
				
					 c[i][j] = a[i][j] + b[i][j];
				 }
			 }
			 for (int i = 0; i<rows; i++) {
				 for (int j = 0; j<cols; j++) {
					System.out.print(c [i][j] +" ");
					 
				 }
				 System.out.println(); 
			 }

}
}


