package escadaseserpentes;

public class Game {
	
	private static final int NUM_SPACES = 30;
	private static final int NUM_PLAYERS = 2;

    public void play() {
    	
    	Board board = new Board(NUM_SPACES);
    	
    	addTransitions(board);
    	
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

	private void addTransitions(Board board) {
		board.addTransition(4, 12);
    	board.addTransition(7, 9);
    	board.addTransition(11, 25);
    	board.addTransition(14, 2);
    	board.addTransition(22, 5);
    	board.addTransition(28, 18);
	}
}