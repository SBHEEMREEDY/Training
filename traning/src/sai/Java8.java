 package sai;

public class Java8 {

	public static void main(String[] args) {
		int vcount=0,ccount=0;
		String str=" this is a dog ";
		str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			 if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
			 {
				 vcount++;
				 
			 }
			 
		}

	}

}
