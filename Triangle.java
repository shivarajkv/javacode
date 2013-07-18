
import java.util.*;
public class Tri {


  public static void main(String[] args) {
		int row,column;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the row size:\n");
		int n=scan.nextInt();
		for(row=1;row<=n;row++)
		{
			for(column=1;column<=row;column++)
				System.out.print("*");

			
			System.out.println();
		}
		
	}
}

