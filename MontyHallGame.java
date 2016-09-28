/**
* Monty Hall Game
* @author Neil
* @version 1.0
*/
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
		//System.out.println("car = " + car);
		
		System.out.print("Please choose a door (1,2, or 3): ");

		int userChoice = kb.nextInt();
		
		//get rid of the newLine from buffer
		kb.nextLine();
		
		System.out.println("You chose door " + userChoice);
		
		
		
		int reveal = doorToRevealRandom(car,userChoice);
	
	
		System.out.println("There is nothing behind door " + reveal);
		
		int doorSwitch = doorToSwitch(reveal,userChoice);
		System.out.print("Would you like to switch to door " + doorSwitch + "? If so type yes: ");
	
	
		String switchChoice = kb.nextLine();
		if (switchChoice.equals("yes"))
		{
			userChoice = doorSwitch;
			System.out.println("Your new door is " + userChoice);
		}
		
		if (userChoice == car)
		{
			System.out.println("Congratulations! You won the car");
		}
		
		else
		{
			System.out.println("Congratulations! You won a goat. The car was behind door " + car + ".");
		}
		
	}

	public static int doorToReveal(int c, int u)
	{
		int count = 1;
		int reveal = 1;
		while (count <= 3)
		{
			if ((reveal == c)||(reveal == u))
			{
				reveal ++;
			}
			count++;
			
		}
		

		System.out.println("Door to reveal is " + reveal);
		return reveal;
		
	}
	
	public static int doorToRevealRandom(int c, int u)
		/**
		*This function chooses a door to reveal randomly
		*The function then checks to see if the door is the users choice or the door with the car
		*If it is either, then the program comes up with a different number
		*This is better than the other doorTo Reveal function because it chooses a number randomly
		*/
	
		{
		int r = (int) (Math.random()*3+1);
		while (r == c || r == u)
		{
			r = (int) (Math.random()*3+1);
		}
		return r;
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
		

		//System.out.println("Door to switch is " + doorToSwitch);
		return doorToSwitch;
	
	}




}