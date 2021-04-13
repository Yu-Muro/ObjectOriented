package quiz2020.qB1toB10;

import use.common.KBInput;

public class QB05 {
	public static void main(String[] args) {
		int n = KBInput.readInt();
		int min = KBInput.readInt();
		for (int i = 1; i < n; i++) {
			int a = KBInput.readInt();
			min = Math.min(min, a);
		}
		System.out.println(min);
	}
}
