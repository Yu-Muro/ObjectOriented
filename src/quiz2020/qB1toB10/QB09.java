package quiz2020.qB1toB10;

public class QB09 {
	public static void main(String[] args) {
		int x = 100; int y = 100;
		int min = x + y;
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				if (4 * i + 5 * j == 80 && min > i + j) {
					x = i;
					y = j;
					min = x + y;
				}
			}
		}
		System.out.println(x);
		System.out.println(y);
	}
}
