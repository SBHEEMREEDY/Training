package sai;

import java.util.Scanner;

public class Java5 {

	public static void main(String[] args) {
		String x,y="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a stringg x");
		x=sc.nextLine();
		int length=x.length();
		for(int i=length-1;i>=0;i--)
			y=y+x.charAt(i);
		//if(x.equals(y))
		 //System.out.println("string is pal: "+y);
		//else
			System.out.println("reverse of :"+y);
		
				}

}
