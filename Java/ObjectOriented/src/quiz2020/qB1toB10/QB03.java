package quiz2020.qB1toB10;

import use.common.KBInput;

public class QB03 {
	public static long pow(int n, int x) {
		long r = 1L;
		for (int i = 0; i < n; i++) {
			r *= x;
		}
		return r;
	}

	public static void main(String[] args) {
		int a = KBInput.readInt();
		int b = KBInput.readInt();
		long ans = 0L;
		if (a >= b) System.out.println("入力エラー");
		else {
			for (int i = a; i <= b; i++) ans += (pow(3, i) + 3 * i);
			System.out.println(ans);
		}
	}
}
