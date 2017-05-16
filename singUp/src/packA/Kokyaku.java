package packA;

public class Kokyaku {
	private int number;
	private String name;
	static int lastNum = 1000;

	Kokyaku(String s) {
		number = ++lastNum;
		name = s;
	}

	Kokyaku() {
	}

	public void setNum(int num) {
		number = num;
	}

	public void setName(String s) {
		name = s;
	}

	public int getNum() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void print() {
		System.out.print(number + "\t");
		System.out.println(name);
	}
}
