 public class BgTwoPlayer {

	public static void main (String[] args) {
		
		Board gameBoard = new Board();
		Dice gameDice = new Dice();
		Play currentPlay;
		HumanPlayer[] player = {new HumanPlayer(Board.X_PLAYER_ID), new HumanPlayer(Board.O_PLAYER_ID)};
		int winner, currentPlayerId, response;	
		boolean validPlay = true, finished = false;
		
		do {
			winner = gameDice.rollDieEach();
			gameDice.displayDieEach();
		} while (winner == Dice.DRAW);
		currentPlayerId = winner;
		
		do {
			gameBoard.displayBoard(currentPlayerId);
			gameDice.rollDice();
			gameDice.displayDice();
			do {
				response = player[currentPlayerId].getDecision();
				if (response == HumanPlayer.PLAY) {
					currentPlay = player[currentPlayerId].getPlay();
					validPlay = gameBoard.checkPlay(currentPlayerId, currentPlay, gameDice);
					if (validPlay) {
						finished = gameBoard.doPlay(currentPlayerId, currentPlay);
					}
				}
			} while ( (response == HumanPlayer.PLAY) && (!validPlay) ); 
			currentPlayerId = gameBoard.opposingPlayer(currentPlayerId);
		} while ( (response != HumanPlayer.QUIT) && (!finished) );
	
		System.out.println("Game Complete");
		
		return;
	}
	
 }
 
 