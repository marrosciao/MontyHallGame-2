import java.util.Scanner;

public class MontyHallGame
{
	public static void main(String[]args)
	{
		//welcome message
		welcome();
		game();
	
	}
	
	
	
	public static void welcome()
	{
		System.out.println("Welcome to the Monty Hall Game");
		System.out.println("Pick a door number first. ");
		System.out.println("You will have a chance to switch after a door has been revealed. ");
		// print out the 3 doors
	}
	
	
	public static void game()
	{
		Scanner kb = new Scanner(System.in);
		int car = (int) (Math.random() * 3 +1);
		
		//testing
		System.out.println("car = " + car);
		
		System.out.print("Please choose a door (1,2, or 3): ");

		int userChoice = kb.nextInt();
		
		//get rid of the newLine from buffer
		kb.nextLine();
		
		System.out.println("You chose door " + userChoice);
		
		
		
		int reveal = doorToReveal(car,userChoice);
	
	
		System.out.println("There is nothing behind door " + reveal);
		
		int doorSwitch = doorToSwitch(reveal,userChoice);
		System.out.println("Would you like to switch to door " + doorSwitch);
		
	}

	public static int doorToReveal(int c, int u)
	{
		int count = 1;
		int doorToReveal = 1;
		while (count <= 3)
		{
			if ((doorToReveal == c)||(doorToReveal == u))
			{
				doorToReveal ++;
			}
			count++;
			
		}
		

		System.out.println("Door to reveal is " + doorToReveal);
		return doorToReveal;
		
	}
	

	
	public static int doorToSwitch(int reveal, int userChoice)
	{
		int count = 1;
		int doorToSwitch = 1;
		while (count <= 3)
		{
			if ((doorToSwitch == reveal)||(doorToSwitch == userChoice))
			{
				doorToSwitch ++;
			}
			count++;
			
		}
		

		System.out.println("Door to switch is " + doorToSwitch);
		return doorToSwitch;
	
	}




}