package practice.testcode;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

import org.junit.Test;

import practice.code.MapPractice;

/**
 * 
 * @author kurodah hashMapに格納したデータがちゃんと入っているか確認するテスト。
 * 
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
		assertEquals("Ichiro",firstStudentName);
		assertEquals("Jiro",secondStudentName);
	}
}
