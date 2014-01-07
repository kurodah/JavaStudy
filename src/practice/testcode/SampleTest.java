
package practice.testcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import practice.code.MainCode;

public class SampleTest {

    @Test
    public void test() {
        MainCode sampleCode = new MainCode();
        String returnText = sampleCode.junitTest();
        assertEquals(returnText, "テストは動作しています");
    }
}
