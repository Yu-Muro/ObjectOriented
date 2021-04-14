package quiz2020.q161to191;

import use.common.KBInput;

public class Entex2 {
	//フィールドの宣言
	private int math, eng, sci, bunrui;
	private float ave;
	//データ入力メソッドの定義
	public void Data_Input() {
		System.out.print("受験科目は?(英数:1 英数理:2)");
		bunrui = KBInput.readInt();
		System.out.print("英語の点数は");
		eng = KBInput.readInt();
		System.out.print("数学の点数は");
		math = KBInput.readInt();
		if (bunrui == 2) {
			System.out.print("理科の点数は");
			sci = KBInput.readInt();
		}
	}

	//平均点を計算するメソッドの定義
	public void average() {
		if (bunrui == 1) ave = (float)(math + eng) / 2;
		else ave = (float)(math + eng + sci) / 3;
	}
	//成績を出力するメソッドの定義
	public void printScore() {
		if (bunrui == 1) System.out.println("英語:" + eng + " 数学:" + math + " 平均:" + ave);
		else System.out.println("英語:" + eng + " 数学:" + math + " 理科:" + sci + " 平均:" + ave);
	}
}
