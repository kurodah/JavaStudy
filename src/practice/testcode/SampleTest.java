
package practice.testcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import practice.code.SampleCode;

public class SampleTest {

    @Test
    public void test() {
        SampleCode sampleCode = new SampleCode();
        String returnText = sampleCode.junitTest();
        assertEquals(returnText, "テストは動作しています");
    }
}
