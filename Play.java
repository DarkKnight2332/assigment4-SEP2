public class Play {
	// a play contains 0-4 moves
	public static final int MAX_MOVES = 4;
	public static final int MAX_STEPS = 2*MAX_MOVES;
	
	private int numMoves = 0;
	private Move[] movesArray = {new Move(), new Move(), new Move(), new Move()};
		
	
	public void setPlay (int... setPips) {
		int index;
		numMoves = setPips.length / 2;
		for (index=0; index<numMoves; index++ ) {
			movesArray[index].setMove(setPips[2*index],setPips[2*index+1]);
		}
		for (; index<MAX_MOVES; index++) {
			movesArray[index].setMove(0,0);			
		}
		return;
	}


	public void addMove (int setFromPip, int setByPips) {
		movesArray[numMoves].setMove(setFromPip,setByPips);
		numMoves++;
		return;
	}
	
	
	public Move getMove (int index) {
		return movesArray[index];
	}

	
	public int length() {
		return numMoves;
	}
}