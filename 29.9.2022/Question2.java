/*
 Write a program to calculate Highest Common Factor(HCF) of Two given number.
 */

import java.util.Scanner;

public class Question2{

	public static void main(String[] args) 
	{

		int num1,num2,hcf=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two  number");
		num1= sc.nextInt();
		num2=sc.nextInt();
		
		for (int i = 1; i <= num1 || i <= num2; i++)       
	      {
	     if (num1 % i == 0 && num2 % i == 0)          
	         hcf = i;
	      }

	    System.out.println("HCF of Two "+num1+ " and "+num2+" is "+ hcf);
	  }
	}

