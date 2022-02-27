import java.util.Scanner;
public class nfibonacci {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=0, b=1,c,i;
	int n=sc.nextInt();
	System.out.print(a+" "+b);
	for(i=1;i<=n;i++) {
		c=a+b;
		System.out.print(" "+c);
        a=b;
        b=c;
        
	}

	}

}