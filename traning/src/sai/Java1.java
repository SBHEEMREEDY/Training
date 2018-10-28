package sai;

import java.util.Scanner;

public class Java1 {

	public static void main(String[] args) {
		int i,n,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		n=sc.nextInt();
		for(c=1;c<=10;c++)
			System.out.println(n+"*"+c+"="+(n*c));

	}
}
