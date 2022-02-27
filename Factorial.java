import java.util.*;
public class Factorial {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        long fact = 1;
        for(int i = 1; i <= f;++i)
        {
            fact *= i;
        }
        System.out.printf("Factorial of %d = %d", f,fact);
    }
}