package escadaseserpentes;

public class Game {
	
	private static final int NUM_SPACES = 30;
	private static final int NUM_PLAYERS = 2;

    public void play() {
    	
    	Board board = new Board(NUM_SPACES);
    	board.print();
    	
    	Counters counters = new Counters(board, NUM_PLAYERS);
    	counters.print();
    }
}