public class Move {
	private int fromPip = 0;
	private int byPips = 0;;
	
	
	public void setMove (int setFromPip, int setByPips) {
		fromPip = setFromPip;
		byPips = setByPips;
		return;
	}
	
	
	public int getFromPip () {
		return fromPip;
	}
	
	
	public int getByPips () {
		return byPips;
	}
}