package address;

public class main {
	public static void main(String[] args) {
		Kokyaku k1 = new Kokyaku(1001, "Tanaka", "Yokohama-City Kanagawa", "0123-456-789");
		Kokyaku k2 = new Kokyaku(1002, "Yamashita", "Sakai-City Osaka", "0000-2222-22");

		k1.print();
		k2.print();
	}
}
