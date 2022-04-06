package newPattern;

public class Newpattern {

	public static void main(String[] args) {
		
		// pattern 1
		for (int row = 1;row <= 5; row++)
		{
			int no = 1;
			for (int col = 1;col <= row; col++ )
			{
				
				System.out.print(no + "    ");
				no++;
			}
			System.out.println();
		}
		
		// pattern 2
		
		for (int row = 1;row <= 5; row++)
		{
			int no = 5;
			for (int col = 1;col <= row; col++ )
			{
				
				System.out.print(no + "    ");
				no--;
			}
			System.out.println();
		}
		
		//////
		
		
		// pattern 4
				for (int row = 1;row <= 5; row++)
				{
					
					for (int col = row;col <= 5; col++ )
					{
						
						System.out.print(col + "    ");
						
					}
					System.out.println();
				}
				
				///pattern 5
				int no = 1;
				for (int row = 1;row <= 5; row++)
				{
					
					for (int col = 1;col <= row; col++ )
					{
						
						System.out.print(no + "    ");
						no++;
					}
					System.out.println();
				}		

	}

}
