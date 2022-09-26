package escadaseserpentes;

public class Space {
	
	public enum Type {
		START_HERE, HOME, REGULAR;
	}
	
	private Type type;
	private int number;
	
	public Space(Type type, int number) {
		this.type = type;
		this.number = number;
	}
	
	public Type getType() {
		return type;
	}
	
	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Space [type=" + type + ", number=" + number + "]";
	}
}
