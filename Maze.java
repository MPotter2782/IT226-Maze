import java.util.Scanner;

public class Maze {

	String mazeRawData;
	int sideLength = 0;
	Cell[][] maze;
	Cell start;
	
	
	
	
	/*
	 * Locates the starting position and assigns it tot he start variable.
	 */
	private void findStart(Cell[][] maze, int length)
	{
		for(int x = 0; x <= length; x++)
		{
			for(int y = 0; y<= length; y++)
			{
				if (maze[x][y].getValue() == 'o')
				{
					start = maze[x][y];
				}
			}
		}
	}
	
	
	/*
	 * Initializes each empty cell.
	 */
	
	private void initCells()
	{
		Cell[][] maze = new Cell[sideLength][sideLength];
		for(int x = 0; x <= sideLength; x++)
		{
			for(int y = 0; y <= sideLength; y++)
			{
				maze[x][y] = new Cell();
			}
		}
	}
	
	/*
	 * This methods returns a string of a maze. There is a check in place
	 * to make sure no characters besides the four expected ones (#,*,o,*)
	 * and another one to make sure there is one start and at least one end.
	 */
	private String enterMaze(Scanner kb)
	{
		String rawMaze = "";
		int startCount = 0;
		boolean noIllegalChars = false;
		while(!noIllegalChars)
		{
			startCount = 0;
			noIllegalChars = true;
			System.out.println("Enter the maze: ");
			rawMaze = kb.nextLine();
			for(int x = 0; x < rawMaze.length()-1; x++)
			{
				if (rawMaze.charAt(x) == 'o')
				{
					startCount++;
				}
				
				if(rawMaze.charAt(x) != '#' && rawMaze.charAt(x) != '*' && rawMaze.charAt(x) != 'o' && rawMaze.charAt(x) != '.')
				{
					noIllegalChars = false;
				}
			}
			if(startCount != 1 || !rawMaze.contains("*"))
			{
				noIllegalChars = false;
			}
		}
		sideLength = (int)Math.round(Math.sqrt(rawMaze.length()-1));
		return rawMaze;
	}
	
	
	
	/*
	 * Reads the input left-to-right/bottom-to-top and feeds it into the cells.
	 */
	private void createCells(String input)
	{
		for (int y = 0; y <= sideLength; y++)
		{
			for (int x = 0; x <= sideLength; x++)
			{
				maze[x][y].setValue(input.charAt(x*sideLength+y));
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
