package practice.code;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class MapPractice {
	// ハッシュマップを試しに使ってみる
	public HashMap<String, String> hashMapPractice() {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		String[] studentNumber = { "1", "2", "3" };
		String[] studentName = { "Ichiro", "Jiro", "Saburo" };
		for (int i = 0; i < studentNumber.length; i++) {
			hashMap.put(studentNumber[i], studentName[i]);
		}
		return hashMap;
	}

	// 次はLinkedHashMapを試してみる
	public LinkedHashMap<String, String> linkedHashMapPractice() {
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
		String[] studentNumber = { "4","1", "2", "3" };
		String[] studentName = { "Siro","Ichiro", "Jiro", "Saburo" };
		for (int i = 0; i < studentNumber.length; i++) {
			linkedHashMap.put(studentNumber[i], studentName[i]);
		}

		return linkedHashMap;
	}

}
