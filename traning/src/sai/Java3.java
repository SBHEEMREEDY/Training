package sai;

import java.util.Scanner;

public class Java3 {

	public static void main(String[] args) {
		int x,y,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		x=sc.nextInt();
		System.out.println("enter a number");
	y=sc.nextInt();
	System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
temp=x;
x=y;
y=temp;
System.out.println("after Swapping\nx = "+x+"\ny = "+y);
	}

}
