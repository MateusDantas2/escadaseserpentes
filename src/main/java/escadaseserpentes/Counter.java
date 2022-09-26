package escadaseserpentes;

public class Counter {
	
	private String name;
	private Space currentSpace;
	
	public Counter(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Space getCurrentSpace() {
		return currentSpace;
	}

	public void goTo(Space space) {
		currentSpace = space;
	}
}
