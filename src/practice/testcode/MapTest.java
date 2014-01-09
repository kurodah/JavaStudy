package practice.testcode;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import org.junit.Test;

import practice.map.MapPractice;

/**
 * 
 * @author kurodah hashMapに格納したデータが入っているか確認するためのテスト。 ※データの並び順を確認するためのテストでは無い。
 *         データの並び順はコンソールを通して確認する。
 */
public class MapTest {

	@Test
	public void hashmapTest() {
		MapPractice mapPractice = new MapPractice();
		HashMap<String, String> resultHashMap = mapPractice.hashMapPractice();
		String firstStudentName = resultHashMap.get("1");
		String secondStudentName = resultHashMap.get("2");
		assertEquals("Ichiro", firstStudentName);
		assertEquals("Jiro", secondStudentName);
	}

	@Test
	public void linkedHashMapTest() {
		MapPractice mapPractice = new MapPractice();
		LinkedHashMap<String, String> linkedHashMap = mapPractice
				.linkedHashMapPractice();
		String firstStudentName = linkedHashMap.get("1");
		String secondStudentName = linkedHashMap.get("2");
		assertEquals("Ichiro", firstStudentName);
		assertEquals("Jiro", secondStudentName);
	}

	@Test
	public void treeMapTest() {
		MapPractice mapPractice = new MapPractice();
		TreeMap<String, String> treeMap = mapPractice.treeMapPractice();
		String firstStudentName = treeMap.get("1");
		String secondStudentName = treeMap.get("2");
		assertEquals("Ichiro", firstStudentName);
		assertEquals("Jiro", secondStudentName);
	}
}
