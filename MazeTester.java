public class MazeTester {

  public static void main(String[] args) {
    MazeReader maze = new MazeReader();

    maze.PrintMaze();

    System.out.println("The spot at 3, 3 is " + maze.toString(3, 3));

  }

}
