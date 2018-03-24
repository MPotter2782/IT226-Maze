public class Cell {


	private int x;
	private int y;
	private char value;
	private boolean isTracked;

	public Cell()
	{

	}

	public Cell(int x, int y)
	{
		this.x = x;
		this.y = y;
		isTracked = false;
	}

	public Cell(int x, int y, char value)
	{
		this.x = x;
		this.y = y;
		this.value = value;
	}

	public int getX() {
		return x;
	}

	public void getsTracked()
	{
		isTracked = true;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public String toString() {
		return Character.toString(value);
	}

}
