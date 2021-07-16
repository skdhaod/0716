
public class Pizza extends Circle{
	private String name;
	
	public Pizza(int size, String name) {
		super(size);
		this.name = name;
	}

	public String toString() {
		return "피자종류:"+name+" 피자크기:"+size;
	}
}
