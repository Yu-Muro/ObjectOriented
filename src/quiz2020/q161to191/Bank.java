package quiz2020.q161to191;

public class Bank {
	//フィールドの宣言
	private String owner;
	private double deposit = 0, rate;
	//オーナーのセット
	public void setOwner(String name) {
		owner = name;
	}
	//利率のセット
	public void setRate(double r) {
		rate = r;
	}
	//オーナーの読み出し
	public String getOwner() {
		return(owner);
	}

	//定期に貯金するメソッド
	public void add(double x) {
		deposit += x;
	}
	//複利計算するメソッド
	public void fukuri() {
		deposit *= (1 + rate / 100);
	}
	//預金を読み出すメソッド
	public double getDeposit() {
		return(deposit);
	}
}