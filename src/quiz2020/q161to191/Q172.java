package quiz2020.q161to191;

public class Q172 {
	public static void main(String[] args) {
		Bank suzuki = new Bank();
		Bank sato = new Bank();
		int y = 0;
		suzuki.add(10); sato.add(10);
		suzuki.setRate(2);
		sato.setRate(3);
		do {
			y++;
			suzuki.fukuri();
			sato.fukuri();
			suzuki.add(10); sato.add(10);
		} while (suzuki.getDeposit() <= 1000 && sato.getDeposit() <= 1000);
		System.out.println(y);
		System.out.println(suzuki.getDeposit());
		System.out.println(sato.getDeposit());
	}
}
