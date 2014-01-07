package practice.code;

public class StartAction {
	public void confirmCode() {
		// データの作成
		MakeListData makeData = new MakeListData();
		makeData.makeStudentList();

		// リスト データの確認（コンソールに出したい）
		ConfirmListData confirmData = new ConfirmListData();
		confirmData.confirmStudentData();

		// Mapデータの確認（コンソールに出したい）
		ConfirmMapData confirmMapData = new ConfirmMapData();
		confirmMapData.confirmHashMap();
		confirmMapData.confirmLinkedHashMap();
		confirmMapData.treeMap();

		// コンストラクタの動きを確認したい
		//普通のコンストラクタ
		ConstractPractice constractPractice= new ConstractPractice();
		constractPractice.useConstract();
		
		//引数有の時に呼び出した際の挙動
		int currentTax = 5;
		ConstractPractice constractPractice2= new ConstractPractice(currentTax);
		constractPractice2.useConstract();
	}
}