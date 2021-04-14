package quiz2020.qB1toB10;

import use.common.KBInput;

public class QB06 {
	public static void main(String[] args) {
		int n = 0; double x = 0; double sum = 0; double ave = 0;
		while (true) {
			x = KBInput.readDouble();
			if (x == -9999) break;
			sum += x; n++;
		}
		ave = sum / n;
		System.out.println(ave);
	}
}
