import java.util.Random;
import java.util.Scanner;
public class Main 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("1 - Rock\n2 - Paper\n3 - Scissors");
		System.out.print("Your time: ");
		int player = keyboard.nextInt();
		check(player);
		
		

	}
	
	public static void check(int player)
	{
		if(player < 1 || player > 3)
		{
			System.err.println("INVALID");
		}
		else game(player);
	}
	
	public static void game(int player)
	{
		Random random = new Random();
		int bot = random.nextInt(4);
		
		boolean win = false;
		boolean draw = false;
		
		switch(player)
		{
			case 1:
			{
				if(bot == 1)
				{
					draw = true;
				}
				else if(bot == 2)
				{
					win = false;
				}
				else if(bot == 3)
				{
					win = true;
				}
				break;
			}
			case 2:
			{
				if(bot == 1)
				{
					win = true;
				}
				else if(bot == 2)
				{
					draw = true;
				}
				else if(bot == 3)
				{
					win = false;
				}
				break;
			}
			case 3:
			{
				if(bot == 1)
				{
					win = false;
				}
				else if(bot == 2)
				{
					win = true;
				}
				else if(bot == 3)
				{
					draw = true;
				}
				break;
			}
		}
		if(bot == 1)
		{
			System.err.println("\nbot: Rock");
		}
		else if(bot == 2)
		{
			System.err.println("\nbot: Paper");
		}
		else if(bot == 3)
		{
			System.err.println("\nbot: Scissors");
		}
		
		result(win, draw);
	}
	
	public static void result(boolean win, boolean draw)
	{
		if(win)
		{
			System.out.println("\n\tYou won...");
		}
		else if(draw)
		{
			System.out.println("\n\tIt's draw...");
		}
		else System.out.println("\n\tYou lose...");
	}

}
