package br.com.softblue.jogo.counter;

import br.com.softblue.jogo.board.Board;
import br.com.softblue.jogo.infrastructure.Printable;

import javax.swing.*;
import java.util.ArrayList;

public class Counters implements Printable {
	
	private Counter[] counters;
	private int currentCounterIndex = -1;

	public Counters(Board board, int numPlayers) {
		counters = new Counter[numPlayers];
		ArrayList<String> players = new ArrayList<>(numPlayers);

		for(int i = 0; i < numPlayers; i++) {
			players.add(i, (JOptionPane.showInputDialog("Digite o Nome do Jogador nº " + (i+1) + ": ")));
			counters[i] = new Counter(String.valueOf(players.get(i)));
		}
		board.setupCounters(counters);
	}
	
	public Counter next() {
		currentCounterIndex = (currentCounterIndex + 1) % counters.length;
		return counters[currentCounterIndex];
	}
	
	@Override
	public void print() {
		for (Counter counter : counters) {
			System.out.format("Jogador '%s' está na posição %s\n", counter.getName(), counter.getCurrentSpace());
		}
	}
}
