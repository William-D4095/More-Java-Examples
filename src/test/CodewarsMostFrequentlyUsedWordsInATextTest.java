package test;

import org.junit.jupiter.api.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Arrays;

public class CodewarsMostFrequentlyUsedWordsInATextTest {

	@Test
	  void sampleTests() {
		    List<String> actual = CodewarsMostFrequentlyUsedWordsInAText.top3("a a a  b  c c  d d d d  e e e e e");
		    assertEquals(List.of("e", "d", "a"), actual);
	}
	@Test
	  void sampleTest1() {
		    List<String> result = CodewarsMostFrequentlyUsedWordsInAText.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e");
		    assertTrue(result.containsAll(List.of("e", "ddd", "aa")) && result.size() == 3);
	}
	@Test
	  void sampleTest2s() {
		    List<String> result = CodewarsMostFrequentlyUsedWordsInAText.top3("  //wont won't won't ");
		    System.out.println(result);
		    assertTrue(result.containsAll(List.of("won't", "wont")) && result.size() == 2);
	}
	@Test
	  void sampleTest3s() {
		    assertEquals(List.of("e"), CodewarsMostFrequentlyUsedWordsInAText.top3("  , e   .. "));
	}
	@Test
	  void sampleTe4sts() {
		    assertTrue(CodewarsMostFrequentlyUsedWordsInAText.top3("  ...  ").isEmpty());
	}
	@Test
	  void sampleT5ests() {
			System.out.println(CodewarsMostFrequentlyUsedWordsInAText.top3("  '  "));
 		    assertTrue(CodewarsMostFrequentlyUsedWordsInAText.top3("  '  ").isEmpty());
	}
	@Test
	  void sampleTes7ts() {
		    assertTrue(CodewarsMostFrequentlyUsedWordsInAText.top3("  '''  ").isEmpty());
	}
	@Test
	  void sampleTest6s() {
		    List<String> result = CodewarsMostFrequentlyUsedWordsInAText.top3("'a 'A 'a' a'A' a'a'!");
		    assertTrue(
		        result.equals(List.of("'a", "a'a'", "'a'")) ||
		        result.equals(List.of("a'a'", "'a", "'a'"))
		    );
	}
	@Test
	  void sampleTests7() {
		    
		   List<String> result = CodewarsMostFrequentlyUsedWordsInAText.top3("""
		                           In a village of La Mancha, the name of which I have no desire to call to
		                           mind, there lived not long since one of those gentlemen that keep a lance
		                           in the lance-rack, an old buckler, a lean hack, and a greyhound for
		                           coursing. An olla of rather more beef than mutton, a salad on most
		                           nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra
		                           on Sundays, made away with three-quarters of his income."""
		                          );
		    assertTrue(result.containsAll(List.of("a", "of", "on")) && result.size() == 3);
		  }
}
