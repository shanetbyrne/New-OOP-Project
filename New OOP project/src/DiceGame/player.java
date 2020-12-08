package DiceGame;
import java.util.Random;

public class player {
    /**
     *
     */
    private int win;
    private int currentRoll;

    public player(){
        this.win = 0;
        this.currentRoll = 0;

    }

    public void roll(){
        Random randNumber = new Random();
        this.currentRoll = randNumber.nextInt(6) + 1;
    }
    public void setWin(){
        this.win++;

    }
    public int getRoll(){
        return this.currentRoll;
    }
    public int getWin(){
        return this.win;
    }

}
