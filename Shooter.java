public class Shooter
{
    private int centerPosX;
    private int centerPosY;
    private String colour;
    private Rectangle body;
    private Rectangle cannon;

    public Shooter(int posX, int posY, String col)
    {
        centerPosX = posX;
        centerPosY = posY;
        colour = col;

        Rectangle body = new Rectangle(centerPosX, centerPosY, 30, 10, colour);
        Rectangle cannon = new Rectangle(centerPosX, centerPosY + 10, 5, 10, colour);      
    }

    public void addTo(GameArena arena)
    {
        arena.addRectangle(body);
        arena.addRectangle(cannon);
    }

}