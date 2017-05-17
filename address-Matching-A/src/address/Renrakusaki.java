package address;

public class Renrakusaki {
	private String address;
	private String tell;

	public Renrakusaki(String add, String name0) {
		address = add;
		tell = name0;
	}

	public Renrakusaki() {
	}

	public void print() {
		System.out.println(address + " " + tell);
	}

}
