import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;

public class Maze {

	private String mazeRawData;

	private ArrayList<ArrayList<Cell>> Cells = new ArrayList();
	private Cell start;

	private int width = 0;
	private int height = 0;

	private File maze1;
	private File maze2;
	private Scanner mazeScan;

	private String MAZE_1 = "maze-1.txt";
	private String MAZE_2 = "maze-2.txt";

	public Maze() {

		//	set up the File
		try {
			maze1 = new File(MAZE_1);
			maze2 = new File(MAZE_2);

			Scanner mazeScan = new Scanner(maze1);

			//	Scan the file line by line
			while(mazeScan.hasNextLine()) {

				String line = mazeScan.nextLine();

				char[] lineCells = line.toCharArray();

				Cells.add(new ArrayList<>());

				for(char cellchar : lineCells) {

					Cells.get(height).add(new Cell(width, height, cellchar));
					width++;

				}

				height++;

				//	Reset the width if it's not the last line.
				if(mazeScan.hasNextLine())
					width = 0;

			}

		}
		catch(FileNotFoundException e) {
			System.out.println("Error: file " + MAZE_1 + " or " + MAZE_2 + " not found.");
			System.exit(0);
		}

	}


	//	Prints the maze
	public void PrintMaze() {
		for(int i = 0; i < Cells.size(); i++) {
			for(int j = 0; j < Cells.get(i).size(); j++) {
				System.out.print(Cells.get(i).get(j).getValue());
			}
			System.out.println();
		}
	}

	/*
	 * Locates the starting position and assigns it tot he start variable.
	 */
	// private void findStart(Cell[][] maze, int length)
	// {
	// 	for(int x = 0; x <= length; x++)
	// 	{
	// 		for(int y = 0; y<= length; y++)
	// 		{
	// 			if (maze[x][y].getValue() == 'o')
	// 			{
	// 				start = maze[x][y];
	// 			}
	// 		}
	// 	}
	// }


	/*
	 * Initializes each empty cell.
	 */

	// private void initCells()
	// {
	// 	Cell[][] maze = new Cell[sideLength][sideLength];
	// 	for(int x = 0; x <= sideLength; x++)
	// 	{
	// 		for(int y = 0; y <= sideLength; y++)
	// 		{
	// 			maze[x][y] = new Cell();
	// 		}
	// 	}
	// }

	/*
	 * This methods returns a string of a maze. There is a check in place
	 * to make sure no characters besides the four expected ones (#,*,o,*)
	 * and another one to make sure there is one start and at least one end.
	 */
	// private String enterMaze(Scanner kb)
	// {
	// 	String rawMaze = "";
	// 	int startCount = 0;
	// 	boolean noIllegalChars = false;
	// 	while(!noIllegalChars)
	// 	{
	// 		startCount = 0;
	// 		noIllegalChars = true;
	// 		System.out.println("Enter the maze: ");
	// 		rawMaze = kb.nextLine();
	// 		for(int x = 0; x < rawMaze.length()-1; x++)
	// 		{
	// 			if (rawMaze.charAt(x) == 'o')
	// 			{
	// 				startCount++;
	// 			}
	//
	// 			if(rawMaze.charAt(x) != '#' && rawMaze.charAt(x) != '*' && rawMaze.charAt(x) != 'o' && rawMaze.charAt(x) != '.')
	// 			{
	// 				noIllegalChars = false;
	// 			}
	// 		}
	// 		if(startCount != 1 || !rawMaze.contains("*"))
	// 		{
	// 			noIllegalChars = false;
	// 		}
	// 	}
	// 	sideLength = (int)Math.round(Math.sqrt(rawMaze.length()-1));
	// 	return rawMaze;
	// }



	/*
	 * Reads the input left-to-right/bottom-to-top and feeds it into the cells.
	 */
	// private void createCells(String input)
	// {
	// 	for (int y = 0; y <= sideLength; y++)
	// 	{
	// 		for (int x = 0; x <= sideLength; x++)
	// 		{
	// 			maze[x][y].setValue(input.charAt(x*sideLength+y));
	// 		}
	// 	}
	// }
}
