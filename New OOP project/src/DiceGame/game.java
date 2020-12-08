package DiceGame;

public class game {
    /**
     * 
     */
    private final player player;
    private final player opponent;
    private static int numberOfGames;
    private static int tied;

    public game(int games){
        player = new player();
        opponent = new player();
        numberOfGames = games;
        tied = 0;

        play();
        displayResults(player.getWin(), opponent.getWin());
    }
    public void play(){
        for(int x = 0; x < numberOfGames; x++){
            player.roll();
            opponent.roll();

            if (player.getRoll() > opponent.getRoll()){
                player.setWin();
            } else if (player.getRoll() < opponent.getRoll()){

            } else {
                tied++;
            }
    }
    }
    public void displayResults(int userWin, int computerWin){
        System.out.println("Results:");
        System.out.println("USer wins......" + userWin);
        System.out.println("Computer Wins....." + computerWin);
        System.out.println("Tied games......" + tied);

        if(userWin > computerWin){
            System.out.println("You beat your opponent");
        }else if (userWin < computerWin){
            System.out.println("Computer has won");
        }else{
            System.out.println("Its a tied game");
        }
    }
}
