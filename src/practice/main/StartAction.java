package practice.main;

import practice.Interface.InterfacePractice;
import practice.Static.StaticPractice;
import practice.accesslevel.AccessLevelPractice;
import practice.constract.ConstractPractice;
import practice.list.ConfirmListData;
import practice.list.MakeListData;
import practice.map.ConfirmMapData;
import practice.override.OverridePractice;

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
		
		//コンストラクタ（引数有）の時に呼び出した際の挙動
		int currentTax = 5;
		ConstractPractice constractPractice2= new ConstractPractice(currentTax);
		constractPractice2.useConstract();
		
		//Interfaceを用いたメソッドを呼び出した際の挙動確認
		InterfacePractice interfacePractice = new InterfacePractice();
		interfacePractice.useInterface();

		//アクセスレベルの挙動について、確認したい
		AccessLevelPractice accessLevelPractice = new AccessLevelPractice();
		accessLevelPractice.confirmAccessLevel();
		
		//オーバーライドした際の挙動について確認したい
		OverridePractice overridePractice = new OverridePractice();
		overridePractice.useTargetMethod("1");	
		
		StaticPractice staticPractice = new StaticPractice();
		staticPractice.useStatic();
	}
}