
class Dice {
	
	public static final int NUM_DICE = 2;
	public static final int DRAW = 3;
	private int[] dice = {1,1};
	private int winner;
	
	
	public void rollDice () {
		for (int i=0; i<NUM_DICE; i++) {
			dice[i] = 1 + (int)(Math.random() * 6);   
		}
		return;
	}
	
	
	public void displayDice () {
		System.out.println("Roll: " + dice[0] + " " + dice[1]);
	}
	
	
	public int rollDieEach () {
		rollDice();
		if (dice[0] > dice[1]) {
			winner = Board.X_PLAYER_ID;
		}
		else if (dice[0] < dice[1]) {
			winner = Board.O_PLAYER_ID;
		}
		else {
			winner = DRAW;
		}
		return winner;
	}
	
	
	public void displayDieEach () {
		System.out.print("Roll: ");
		Board.displayChecker(Board.X_PLAYER_ID);
		System.out.print(" " + dice[0] + " ");
		Board.displayChecker(Board.O_PLAYER_ID);
		System.out.print(" " + dice[1] + " ");
		if (winner == DRAW) {
			System.out.println("DRAW");
		}
		else {
			System.out.print("Player ");
			Board.displayChecker(winner);
			System.out.println(" starts!");
		}
		return;
	}
	
	
	public int getDie (int index) {
		return dice[index];
	}
	
	
}