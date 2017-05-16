package packA;

import lib.Input;
import packB.Staff;

public class main {
	public static void main(String[] args) {
		String a = "", b = "", c = "", d = " ";

		Kokyaku k1 = new Kokyaku(Input.getStr(a));
		Kokyaku k2 = new Kokyaku(Input.getStr(b));
		Kokyaku k3 = new Kokyaku(Input.getStr(c));

		Staff s1 = new Staff(Input.getStr(d));

		k1.print();
		k2.print();
		k3.print();
		s1.print();
		/* 作ったものがパッと見て分かるコードを書く。
		 * 自分のことではなく、人のことを考えるのがプロ。 */
	}
}
