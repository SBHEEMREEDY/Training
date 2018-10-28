package sai;

import java.util.Scanner;

public class Java6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
String x=sc.nextLine();
int count=0;

	for(int i=0;i<x.length();i++) 
	{ 
	for(int j=i+1;j<x.length();j++) 
	{ 
	if(x.charAt(i)==x.charAt(j)) 
	{ 
	System.out.println(x.charAt(j)); 
	count++; 
	//System.out.println(count);
	}
	}
	}
	}
} 

