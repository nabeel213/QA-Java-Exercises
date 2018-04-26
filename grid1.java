//package grid;
import java.util.Scanner; 


public class grid1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int grid[][] = new int [10][10];
        int positionXT = 3, positionYT = 4, positionXP = 2, positionYP = 1;
		for( int i = 0; i < 10 ; i++)
		for(int j = 0; j < 10; j++)
		  grid [i][j] = 0;
		
		  //grid[3][4] = 100;
		  //grid[8][8] =1;
		  grid[positionXT][positionYT]=100;
		  grid[positionXP][positionYP]=1;

		  //int grid[][] = new int [10][10];

		for( int i = 0; i < 10 ; i++) {
		    for(int j = 0; j < 10; j++){
		      System.out.print(" " + grid[i][j] + " " );
		      System.out.println();
		  }
		}		
	    System.out.println(Math.hypot(positionXT - positionXP, positionYT - positionYP));
		while(positionXT!=positionXP || positionYT!=positionYP)
		{
			grid[positionXP][positionYP]=0;
			int direction;
			direction = scan.nextInt();
			switch(direction)
			{
			    case 1:
			     positionXP=positionXP-1;
			     break;
			    case 2:
			     positionYP=positionYP+1;
			     break;
			    case 3:
			     positionXP=positionXP+1;
			     break;
			    case 4:
			     positionYP=positionYP-1;
			     break;
				
			}
			grid[positionXP][positionYP]=1;
			for(int i=0;i<10;i++) {
				for(int j=0;j<10;j++) {
					System.out.print(" " + grid[i][j] + " ");
				}
				System.out.println();
			} 
			System.out.println(Math.hypot(positionXT - positionXP, positionYT-positionYP));
		}
		System.out.println("you won");
	}
}
