//import java.util.Random;

public class Driver
{
    public static void main(String[] args)
    {
        GameArena game = new GameArena(500, 500);
        Ball circle = new Ball(100, 250, 0, 0, 10, "WHITE");
        game.addBall(circle);
        Rectangle square = new Rectangle(100, 100, 10, 10, "WHITE");
        game.addRectangle(square);

/*
        Random rand = new Random();
        Ball[] ballArray = new Ball[5];
*/
        Shooter player = new Shooter(250, 250, "WHITE");
        player.addTo(game);

/*
        for (int i = 0; i < 5; i++)
        {
            ballArray[i] = new Ball(100, 250, 0, 0, 10, "WHITE");
            ballArray[i].setXPosition(rand.nextInt(game.getWidth()));
            ballArray[i].setYPosition(rand.nextInt(game.getHeight()));
            ballArray[i].setXVelocity(rand.nextInt(20) - 10);
            ballArray[i].setYVelocity(rand.nextInt(20) - 10);
            game.addBall(ballArray[i]);
        }

        while (true)
        {
            for (int i = 0; i < 5; i++)
            {
                ballArray[i].movement(500, 500);
            }

            game.pause();
        }
*/
    }
}