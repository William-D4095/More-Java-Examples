package Codewars;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CodewarsFindTheUnknownDigitTest {

	@Test
	void testSample() {
		assertEquals(2, CodewarsFindTheUnknownDigit.solveExpression("1+1=?"), "expression = \"1+1=?\"");
	}

	@Test
	void testSample1() {
		assertEquals(6, CodewarsFindTheUnknownDigit.solveExpression("123*45?=5?088"), "expression = \"123*45?=5?088\"");
	}

	@Test
	void testSample2() {
		assertEquals(0, CodewarsFindTheUnknownDigit.solveExpression("-5?*-1=5?"), "expression = \"-5?*-1=5?\"");
	}

	@Test
	void testSample3() {
		assertEquals(-1, CodewarsFindTheUnknownDigit.solveExpression("19--45=5?"), "expression = \"19--45=5?\"");
	}

	@Test
	void testSample4() {
		assertEquals(5, CodewarsFindTheUnknownDigit.solveExpression("??*??=302?"), "expression = \"??*??=302?\"");
	}

	@Test
	void testSample5() {
		assertEquals(2, CodewarsFindTheUnknownDigit.solveExpression("?*11=??"), "expression = \"?*11=??\"");
	}

	@Test
	void testSample6() {
		assertEquals(2, CodewarsFindTheUnknownDigit.solveExpression("??*1=??"), "expression = \"??*1=??\"");
	}

	@Test
	void testSample7() {
		assertEquals(-1, CodewarsFindTheUnknownDigit.solveExpression("??+??=??"), "expression = \"??+??=??\"");
	}
}
