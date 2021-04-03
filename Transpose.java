import java.io.*;
import java.util.*;
public class Transpose
{
	public static void main(String args[])
	{
		int m,n,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of matrix : ");
		m = sc.nextInt();
		n  = sc.nextInt();
		int matrix[][] = new int[m][n];
		int transpose[][] = new int[n][m];
	      System.out.println("Enter the elements of matrix : ");
	      for (c = 0; c < m; c++)
	         for (d = 0; d < n; d++)
	            matrix[c][d] = sc.nextInt();
	      for (c = 0; c < m; c++)
	         for (d = 0; d < n; d++)
	             transpose[d][c] = matrix[c][d];  
	      for (c = 0; c < n; c++)
	      {
	         for (d = 0; d < m; d++)
	            System.out.print(transpose[c][d]+"\t");
	         System.out.println();
	      }
	}
}