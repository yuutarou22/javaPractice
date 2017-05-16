package packB;

public class Staff {

	private int number;
	private String name;
	static int lastNum = 1000;

	public Staff(String s) {
		number = ++lastNum;
		name = s;
	}

	Staff() {
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
