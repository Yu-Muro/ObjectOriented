package quiz2020.q161to191;

public class Q171 {
	public static void main(String[] args) {
		Bank suzuki = new Bank();
		Bank sato = new Bank();
		int y = 0;
		suzuki.setOwner("suzuki");
		sato.setOwner("sato");
		suzuki.add(100); sato.add(50);
		suzuki.setRate(3); sato.setRate(5);
		do {
			suzuki.fukuri(); sato.fukuri();
			y++;
		} while (suzuki.getDeposit() > sato.getDeposit());
		System.out.println(y);
	}
}
