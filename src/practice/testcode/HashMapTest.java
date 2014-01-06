package practice.testcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import practice.code.MapPractice;

public class HashMapTest {

    @Test
    public void hashmapTest() {
        MapPractice mapPractice = new MapPractice();
        String returnMapText = mapPractice.hashmapTest();
        assertEquals(returnMapText, "Ichiro");
    }
}
