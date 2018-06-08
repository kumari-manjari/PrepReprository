package Test;

import java.util.Arrays;

public class fibonacci {

	public static void main(String[] args) {
		fibonacci fb1=new fibonacci();
		
		int n=10;
	
		int[]fb=new int[10];
		fb[0]=0;
		fb[1]=1;
		
		for(int i=2;i<10;i++)
		{
			fb[i]=fb[i-1]+fb[i-2];
			 System.out.print(fb1.fibonai(i));
		}
   //     System.out.println("Fibonacci Series "+Arrays.toString(fb));
        int s=0;
        int[] fib=new int[n];
        for(int i=1;i<n;i++)
        {
         s=fb1.fibonai(i);
         System.out.println(s);
         fib[i]=s;
         
        }
     //   System.out.println("Fibonacci series "+fb1.fibonai(10));
        System.out.println(" Recursive Fibonacci series "+String.valueOf(fib[9]));
        
	}

	public static int fibonai(int n)
	{   
	 if(n==1 || n==2)
		 return 1;
	 return fibonai(n-1)+fibonai(n-2);
		 
	}
		
	
}
