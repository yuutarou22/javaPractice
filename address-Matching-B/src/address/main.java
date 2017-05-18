package address;

public class main {
	public static void main(String[] args) {
		Kokyaku[] kList = new Kokyaku[2];

		kList[0] = new Kokyaku(1001, "Tanaka", "Yokohama-City Kanagawa", "0123-456-789");
		kList[1] = new Kokyaku(1002, "Yamashita", "Sakai-City Osaka", "0000-2222-22");

		for(int i = 0; i < 2; i++) {
			kList[i].print();
		}
	}
}
