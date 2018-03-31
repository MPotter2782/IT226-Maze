
public class MazeSolver {

	Cell start;
	Cell currentCell;
	Cell[][] maze;
	StackLinkedList<String> solution = new StackLinkedList<String>();
	final String NORTH = "N";
	final String EAST = "E";
	final String SOUTH = "S";
	final String WEST = "W";
	
	public MazeSolver()
	{
		
	}
	
	public MazeSolver(Maze maze)
	{
		maze = new Maze();
		this.maze = maze.maze;
	}
	
	
	
	
	private void solve(int x, int y)
	{
		
		if (maze[x][y+1].getValue() != '#' && maze[x][y+1].isTracked == false)
		{
			solve(x,y+1);
		}
		if (maze[x+1][y].getValue() != '#' && maze[x+1][y].isTracked == false)
		{
			solve(x+1,y);
		}
		if (maze[x][y-1].getValue() != '#' && maze[x][y-1].isTracked == false)
		{
			solve(x,y-1);
		}
		if (maze[x-1][y].getValue() != '#' && maze[x-1][y].isTracked == false)
		{
			solve(x-1,y);
		}
		
	}
	
	
	
	
	public boolean hasStart(Maze m)
	{
		boolean start = false;
		for(int i = 0; i < m.length; i++)
			for(int j = 0; j < m[].length; j++)
			{
				if(maze[i][j].getValue() == 'o')
					start == true;
			}
		}
		return start;
	}
	
}
