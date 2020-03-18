/* Models a simple solid sphere. 
/**
 * This class represents a Ball object. When combined with the GameArena class,
 * instances of the Ball class can be displayed on the screen.
 */
public class Ball 
{
	// The following instance variables define the
	// information needed to represent a Ball
	// Feel free to more instance variables if you think it will 
	// support your work... 
	private double xVelocity;
	private double yVelocity;
	
	private double xPosition;			// The X coordinate of this Ball
	private double yPosition;			// The Y coordinate of this Ball
	private double size;				// The diameter of this Ball
	private String colour;				// The colour of this Ball

										// Permissable colours are:
										// BLACK, BLUE, CYAN, DARKGREY, GREY,
										// GREEN, LIGHTGREY, MAGENTA, ORANGE,
										// PINK, RED, WHITE, YELLOW 

	/**
	 * Constructor. Creates a Ball with the given parameters.
	 * @param x The x co-ordinate of centre of the Ball (in pixels)
	 * @param y The y co-ordinate of centre of the Ball (in pixels)
	 * @param diameter The diameter of the Ball (in pixels)
	 * @param col The colour of the Ball (Permissable colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW)
	 */
	public Ball(double x, double y, double xv, double yv, double diameter, String col)
	{
		xVelocity = xv;
		yVelocity = yv;

		xPosition = x;
		yPosition = y;
		size = diameter;
		colour = col;
	}	

	public double getXVelocity()
	{
		return xVelocity;
	}

	public double getYVelocity()
	{
		return yVelocity;
	}

	public void setXVelocity(double x)
	{
		this.xVelocity = x;
	}

	public void setYVelocity(double y)
	{
		this.yVelocity = y;
	}

	/**
	 * Obtains the current position of this Ball.
	 * @return the X coordinate of this Ball within the GameArena.
	 */
	public double getXPosition()
	{
		return xPosition;
	}

	/**
	 * Obtains the current position of this Ball.
	 * @return the Y coordinate of this Ball within the GameArena.
	 */
	public double getYPosition()
	{
		return yPosition;
	}

	/**
	 * Moves the current position of this Ball to the given co-ordinates
	 * @param x the new x co-ordinate of this Ball
	 */
	public void setXPosition(double x)
	{
		this.xPosition = x;
	}

	/**
	 * Moves the current position of this Ball to the given co-ordinates
	 * @param y the new y co-ordinate of this Ball
	 */
	public void setYPosition(double y)
	{
		this.yPosition = y;
	}

	/**
	 * Obtains the size of this Ball.
	 * @return the diameter of this Ball,in pixels.
	 */
	public double getSize()
	{
		return size;
	}
	
	/**
	 * Sets the diameter of this Ball to the given size.
	 * @param s the new diameter of this Ball, in pixels.
	 */
	public void setSize(double s)
	{
		size = s;
	}

	/**
	 * Obtains the colour of this Ball.
	 * @return a textual description of the colour of this Ball.
	 */
	public String getColour()
	{
		return colour;
	}

	/**
	 * Sets the colour of this Ball.
	 * @param c the new colour of this Ball, as a String value. Permissable colours are: BLACK, BLUE, CYAN, DARKGREY, GREY, GREEN, LIGHTGREY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW.
	 */
	public void setColour(String c)
	{
		colour = c;
	}

	public void movement(int arenaWidth, int arenaHeight)
	{
		this.setXPosition(this.getXPosition() + this.getXVelocity());
		if (this.getXPosition() > arenaWidth)
		{
			this.setXPosition(arenaWidth);
			this.setXVelocity((-1) * this.getXVelocity());
		}
		else if (this.getXPosition() < 0)
		{
			this.setXPosition(0);
			this.setXVelocity((-1) * this.getXVelocity());
		}
		this.setYPosition(this.getYPosition() + this.getYVelocity());
		if (this.getYPosition() > arenaHeight)
		{
			this.setYPosition(arenaHeight);
			this.setYVelocity((-1) * this.getYVelocity());
		}
		else if (this.getYPosition() < 0)
		{
			this.setYPosition(0);
			this.setYVelocity((-1) * this.getYVelocity());
		}
	}
}