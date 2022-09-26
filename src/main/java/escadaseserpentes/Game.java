package escadaseserpentes;

public class Game {
	
	private static final int NUM_SPACES = 30;

    public void play() {
    	
    	Board board = new Board(NUM_SPACES);
    	board.print();
    }
}