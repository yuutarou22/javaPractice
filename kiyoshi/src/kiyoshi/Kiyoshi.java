package kiyoshi;

public class Kiyoshi {
	public static void main(String[] args) throws InterruptedException {
		String[] zndk = new String[5];
		boolean resalt = false;
		while(resalt == false) {
			for(int i = 0; i < 5; i++) {
				int r = new java.util.Random().nextInt(2);
				switch (r) {
				case 0:
					zndk[i] = "ズン";
					System.out.print("ズン");
					break;
				case 1:
					zndk[i] = "ドコ";
					System.out.print("ドコ");
					break;
				}
				String kiyoshi = zndk[0] + zndk[1] + zndk[2] + zndk[3] + zndk[4];
				if(i == 4 && kiyoshi.equals("ズンズンズンズンドコ")) {
					Thread.sleep(480);
					System.out.print("キ");
					Thread.sleep(120);
					System.out.print("･");
					Thread.sleep(120);
					System.out.print("ヨ");
					Thread.sleep(120);
					System.out.print("･");
					Thread.sleep(120);
					System.out.print("シ!");
					Thread.sleep(120);
					resalt = true;
				} else {
					switch (i) {
					case 0:
						Thread.sleep(900);
						break;
					case 1:
						Thread.sleep(600);
						break;
					case 2:
						Thread.sleep(600);
						break;
					case 3:
						Thread.sleep(480);
						break;
					case 4:
						Thread.sleep(480);
						break;
					}
				}
			}
			System.out.println();
		}
	}
}
