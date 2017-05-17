package address;

public class main {
	public static void main(String[] args) {
		Kokyaku k1 = new Kokyaku(1001, "Tanaka");
		Renrakusaki r1 = new Renrakusaki("Yokohama-City Kanagawa", "0123-456-789");
		k1.setRenrakusaki(r1);

		Kokyaku k2 = new Kokyaku(1002, "Yamashita");
		Renrakusaki r2 = new Renrakusaki("Sakai-City Osaka", "0000-2222-22");
		k2.setRenrakusaki(r2);

		k1.print();
		k2.print();
	}
}
