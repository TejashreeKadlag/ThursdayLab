package ThursdayLab_29;


import java.util.*;

public class Question3
{
Scanner sc=new Scanner(System.in);
int n,temp=0;

 void prime() 
 {
	System.out.println("Enter the Number :");
	n=sc.nextInt(); //input from user
	
	if(n==0||n==1)  //0 or 1 is not prime number
	{
		System.out.println(n+" It is not prime number");
	}
	else
  {	
	for(int i=2;i<n;i++)
	{
	if(n%i==0) //To check number is is divisible by any number
	{ 
		System.out.println(n+" it is not prime number");
		temp=1; // temporary variable 
		break;
	}
	}
	if(temp==0) 
	{
	System.out.println(n+" it is  prime number");
	evenOdd(n);
	}   
  }
} //End Prime method
   void evenOdd(int n) // it is execute when number is prime
   {
	 if(n%2==0)  // to check number is even
	 {
		 System.out.println("It is even number");
		 if(n%10==0)  // to check number is divisible by 10
		 {
			 System.out.println("It is Divisble by 10");
		 }
		 else
		 {
			 System.out.println("It is not divisble by 10"); 
		 }
	 } //End if
	 else  //it is odd numbers
	 {
		 System.out.println("It is Odd number");
		 if(n%3==0) //to check number is divisible by 3
		 {
			 System.out.println("It is divisible by 3");
		 }
		 else 
		 {
			 System.out.println("It is not divisible by 3");
		 }
	 }//end else
 }
   public static void main(String[] args)
   {
	Question3 q=new Question3();
	q.prime(); 
  }
}