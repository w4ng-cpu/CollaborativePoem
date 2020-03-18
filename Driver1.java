import java.util.ArrayList;
import java.util.Random;

public class Driver1
{
    public static void main(String[] args)
    {
        GameArena game = new GameArena(200, 250);
        Random rand = new Random();
        Ball[] ballArray = new Ball[5];
        int cycle = 0;

        Ball b = new Ball(100, 250, 4, 6, 10, "GREEN");
        game.addBall(b);

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
            b.movement(game.getWidth(), game.getHeight());

            for (int i = 0; i < 5; i++)
            {
                ballArray[i].movement(game.getWidth(), game.getHeight());
            }

            game.pause(50);
        }
    }
}