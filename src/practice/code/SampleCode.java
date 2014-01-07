package practice.code;

public class SampleCode {
	public static void main(String args[]) {
		// データの作成
		MakeListData makeData = new MakeListData();
		makeData.makeStudentList();

		// データの確認
		ConfirmListData confirmData = new ConfirmListData();
		confirmData.confirmStudentData();

		ConfirmMapData confirmMapData = new ConfirmMapData();
		confirmMapData.confirmHashMap();
		confirmMapData.confirmLinkedHashMap();
	}

	public String junitTest() {
		return "テストは動作しています";

	}
}
