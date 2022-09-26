package escadaseserpentes;

public class Counters implements Printable {
	
	private Counter[] counters;
	private int currentCounterIndex;
	
	public Counters(Board board, int numPlayers) {
		counters = new Counter[numPlayers];
		char currentName = 'A';
		
		for (int i = 0; i < counters.length; i++) {
			counters[i] = new Counter(String.valueOf(currentName));
			currentName++;
		}
		
		board.setupCounters(counters);
	}

	@Override
	public void print() {
		for (Counter counter : counters) {
			System.out.format("Jogador '%s' está na posição %s\n", counter.getName(), counter.getCurrentSpace());
		}
	}
}
