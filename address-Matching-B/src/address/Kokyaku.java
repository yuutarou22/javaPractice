package address;

public class Kokyaku {
	private int id;
	private String name;
	private Renrakusaki ren;

	public Kokyaku(int id0, String name0, String adr0, String tell0) {
		id = id0;
		name = name0;
		ren = new Renrakusaki(adr0, tell0);
	}

	public void setRenrakusaki(Renrakusaki ren0) {
		ren = ren0;
	}

	public void print() {
		System.out.println(id + " " + name);
		ren.print();
	}

}
