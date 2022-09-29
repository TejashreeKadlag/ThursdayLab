//  Write a program to accept a number from user and then prints the sum of the even and odd integers.

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		
		int n, even = 0, odd = 0;
		char ans;
        Scanner sc = new Scanner(System.in);
        do
        {
        System.out.print("Enter the number of elements you want to enter");
		n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                even = even + a[i];
            }
            else
            {
                odd = odd + a[i];
            }
        }
        System.out.println("Do you want to addd another item y/n");   
		ans=sc.next().charAt(0);
        }
        while(ans=='Y'||ans=='y');
        System.out.println("Sum of Even Numbers:"+even);
        System.out.println("Sum of Odd Numbers:"+odd);
    }
}