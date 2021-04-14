package quiz2020.qB1toB10;

import use.common.KBInput;

public class QB01 {
	public static void main(String[] args) {
		int a, b, c; String ans = "";
		a = KBInput.readInt();
		b = KBInput.readInt();
		c = KBInput.readInt();
		if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
			ans += "直角";
		}
		if (a == b && a == c) {
			ans += "正";
		} else if (a == b || b == c || a == c) {
			ans += "二等辺";
		}
		ans += "三角形";
		System.out.println(ans);
	}
}
