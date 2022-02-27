
import java.util.*;

class Reverse {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	String a=sc.next();
		String str= a, nstr="";
		char ch;
	
	System.out.print("Original word: "+str);
	System.out.println();
	
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); 
		nstr= ch+nstr; 
	}
	System.out.println("Reversed word: "+ nstr);
	}
}


