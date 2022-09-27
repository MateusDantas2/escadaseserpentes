package escadaseserpentes;

public class Space {
	
	public enum Type {
		START_HERE, HOME, REGULAR;
	}
	
	private int number;
	private Type type;
	private Transition transition;
	
	public Space(int number, Type type) {
		this.number = number;
		this.type = type;
	}
	
	public int getNumber() {
		return number;
	}
	
	public Type getType() {
		return type;
	}
	
	public Transition getTransition() {
		return transition;
	}
	
	public void setTransition(Transition transition) {
		this.transition = transition;
	}

	@Override
	public String toString() {
		if (type == Type.REGULAR) {
			return String.valueOf(number);
		} else {
			return number + " (" + type + ")";
		}
	}
}
