package practice.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapPractice {
	// HashMapを試しに使ってみる
	// HashMapはデータを入れた順番に関係なくデータを格納する。
	//コンソール　hashMap：{3=Saburo, 2=Jiro, 1=Ichiro, 4=Siro}
	public HashMap<String, String> hashMapPractice() {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		String[] studentNumber = { "4", "1", "2", "3" };
		String[] studentName = { "Siro", "Ichiro", "Jiro", "Saburo" };
		for (int i = 0; i < studentNumber.length; i++) {
			hashMap.put(studentNumber[i], studentName[i]);
		}
		return hashMap;
	}

	// 次はLinkedHashMapを試してみる
	// LinkedHashMapは入れた順番にデータを格納する
	//コンソール　linkedHashMap：{4=Siro, 1=Ichiro, 2=Jiro, 3=Saburo}
	public LinkedHashMap<String, String> linkedHashMapPractice() {
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
		String[] studentNumber = { "4", "1", "2", "3" };
		String[] studentName = { "Siro", "Ichiro", "Jiro", "Saburo" };
		for (int i = 0; i < studentNumber.length; i++) {
			linkedHashMap.put(studentNumber[i], studentName[i]);
		}
		return linkedHashMap;
	}

	// TreeMapを試してみる
	// TreeMapだと自動でソートしてくれるため、以下のようなコンソールになる。
	// コンソール→　treeMap：{1=Ichiro, 2=Jiro, 3=Saburo, 4=Siro}
	public TreeMap<String, String> treeMapPractice() {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		String[] studentNumber = { "4", "1", "2", "3" };
		String[] studentName = { "Siro", "Ichiro", "Jiro", "Saburo" };
		for (int i = 0; i < studentNumber.length; i++) {
			treeMap.put(studentNumber[i], studentName[i]);
		}
		return treeMap;
	}
}
