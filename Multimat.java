import java.io.*;
import java.util.*;
public class Multimat
{
	public static void main(String args[])
	{
		int m, n, p, q, sum = 0, c, d, k;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of first matrix matrix : ");
	    m = sc.nextInt();
	    n  = sc.nextInt();
	    int first[][] = new int[m][n];
	    System.out.println("Enter elements of first matrix");
	    for (c = 0; c < m; c++)
	    	for (d = 0; d < n; d++)
	            first[c][d] = sc.nextInt();
		System.out.print("Enter the number of rows and columns of second matrix matrix : ");
	    p = sc.nextInt();
	    q  = sc.nextInt();
	    int second[][] = new int[m][n];
	    System.out.println("Enter elements of second matrix");
	    for (c = 0; c < p; c++)
	    	for (d = 0; d < q; d++)
	            second[c][d] = sc.nextInt();
	    if(n!=p)
	    	System.out.println("MULTIPLCATION ERROR!!!!!!");
	    else
	    {
	    	int multiply[][] = new int[m][p];
	    	for (c = 0; c < m; c++)
	         {
	            for (d = 0; d < q; d++)
	            {  
	               for (k = 0; k < p; k++)
	               {
	                  sum = sum + first[c][k]*second[k][d];
	               }
	               multiply[c][d] = sum;
	               sum = 0;
	            }
	         }
	    	System.out.println("Product of Matrices : ");
	    	for(c=0;c<m;c++)
	    	{
	    		for(d=0;d<q;d++)
	    		{
	    			System.out.print(multiply[c][d]+" ");
	    		}
	    		System.out.println();
	    	}
	    	
	    }
	}
}