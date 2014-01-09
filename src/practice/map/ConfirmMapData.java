package practice.map;


public class ConfirmMapData {
	public void confirmHashMap() {
		MapPractice mapPractice = new MapPractice();
		System.out.println("hashMap：" + mapPractice.hashMapPractice());
	}

	public void confirmLinkedHashMap() {
		MapPractice mapPractice = new MapPractice();
		System.out.println("linkedHashMap："
				+ mapPractice.linkedHashMapPractice());
	}

	public void treeMap() {
		MapPractice mapPractice = new MapPractice();
		System.out.println("treeMap：" + mapPractice.treeMapPractice());
	}
}
