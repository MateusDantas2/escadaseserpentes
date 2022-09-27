package escadaseserpentes;

public class Game {
	
	private static final int NUM_SPACES = 30;
	private static final int NUM_PLAYERS = 2;

    public void play() {
    	
    	Board board = new Board(NUM_SPACES);
    	board.print();
    	
    	Counters counters = new Counters(board, NUM_PLAYERS);
    	counters.print();
    	
    	while (!board.gameFinished()) {
    		Counter currentCounter = counters.next();
    		currentCounter.play(board);
    		
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    	
    	Counter winnerCounter = board.getWinnerCounter();
    	System.out.format("Jogador '%s' GANHOU!\n", winnerCounter.getName());
    }
    
}