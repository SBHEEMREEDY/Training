package sai;

import java.util.Scanner;

public class Java4 {

	public static void main(String[] args) {
		int c,n,fact=1;
		System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(c=1;c<=n;c++)
	fact=fact*c;
System.out.println("factorial of "+n+"is"+fact);

	}

}
