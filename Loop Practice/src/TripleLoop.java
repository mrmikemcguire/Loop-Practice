import java.util.Scanner;

public class TripleLoop
	{
	static int spaceTotal;
	static int hashtagTotal = 2;
	
	public static void main(String[] args)
		{
		displayPyramid(getSize());
		}
	
	public static int getSize()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("How tall do you want your pyramid?");
		int size = userInput.nextInt();
		return size;
		}
	
	public static void displayPyramid(int height)
		{
		spaceTotal = height + 1;
		for (int i = 0; i < height; i++)
			{
			System.out.println();
			for (int j = 0; j < spaceTotal; j++)
				{				
				System.out.print(" ");
				}
			spaceTotal--; 	
			for (int l = 0; l < hashtagTotal; l++)
				{
				System.out.print("#");
				}
			hashtagTotal++;
			}
		}
	}
	
