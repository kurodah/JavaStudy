package practice.testcode;

import static org.junit.Assert.*;

import org.junit.Test;

import practice.code.ConstractPractice;

public class constractPracticeTestTest {

	/**
	 * 引数無のコンストラクタを使用した場合のテスト
	 */
	@Test
	public void constractTest1() {
		ConstractPractice constractPractice = new ConstractPractice();
		int lastTaxResult = constractPractice.useConstract();
		assertEquals(lastTaxResult, 3);
	}

	/**
	 * 引数有のコンストラクタを使用した場合のテスト
	 */
	@Test
	public void constractTest2() {
		int currentTax = 5;
		ConstractPractice constractPractice = new ConstractPractice(currentTax);
		int lastTaxResult = constractPractice.useConstract();
		assertEquals(lastTaxResult, 8);
	}

}
