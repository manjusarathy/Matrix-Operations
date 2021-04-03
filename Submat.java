import java.util.Scanner;
public class Submat
{
	public static void  main(String args[])
	{
		int m,n,c,d;
		Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the number of rows and columns of matrix : ");
	      m = sc.nextInt();
	      n  = sc.nextInt();
	     
	      int first[][] = new int[m][n];
	      int second[][] = new int[m][n];
	      int diff[][] = new int[m][n];
	     
	      System.out.println("Enter the elements of first matrix : ");
	     
	      for (c = 0; c < m; c++)
	         for (d = 0; d < n; d++)
	            first[c][d] = sc.nextInt();
	           
	      System.out.println("Enter the elements of second matrix : ");
	     
	      for (c = 0 ; c < m ; c++)
	         for (d = 0 ; d < n ; d++)
	            second[c][d] = sc.nextInt();
	           
	      for (c = 0; c < m; c++)
	         for (d = 0; d < n; d++)
	             diff[c][d] = first[c][d] - second[c][d];  
	 
	      System.out.println("Difference of the matrices:");
	     
	      for (c = 0; c < m; c++)
	      {
	         for (d = 0; d < n; d++)
	            System.out.print(diff[c][d]+"\t");
	         
	         System.out.println();
	      }
	}
}