package quiz2020.qB1toB10;

import use.common.KBInput;

public class QB02 {
	static long factorial(int n) {
		long r = 1L;
		for (int i = 1; i <= n; i++) {
			r *= i;
		}
		return r;
	}

	public static void main(String[] args) {
		int x = KBInput.readInt();
		long ans = factorial(x);
		System.out.println(ans);
	}
}
