import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;

public class MazeReader {

	private String mazeRawData;

	private ArrayList<ArrayList<Cell>> Cells = new ArrayList();
	private Cell start;

	private static int width = 0;
	private static int height = 0;

	private File maze1;
	private File maze2;
	private Scanner mazeScan;

	private String MAZE_1 = "maze-1.txt";
	private String MAZE_2 = "maze-2.txt";

	public MazeReader() {

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

	public String toString(int x, int y) {
		return Cells.get(x).get(y).toString();
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

	//	Get the height of the maze
	public static int getHeight() {
		return height;
	}

	/**
	*
	*
	*/
	public static int getWidth() {
		return width;
	}

	public int countEnds()
	{
		int count = 0;
		for(int i = 0; i < Cells.size() ; i++)
			for(int j = 0; j < Cells.get(i).size(); j++)
			{
				if(Cells.get(x).get(y).getValue() == '*')
					count++;
			}
		}
		return count;
	}



}
