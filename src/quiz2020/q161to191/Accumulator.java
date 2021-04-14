package quiz2020.q161to191;

public class Accumulator {
	//フィールドの宣言
	private int accumulator=0;
	//累計するメソッド
	public void add(int x){
		accumulator += x;
	}
	//値を返すメソッド
	public int value(){
		return accumulator;
	}
}
