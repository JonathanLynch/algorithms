package algorithms;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Testing: [0, 0, 0, 1] ==> 1 Testing: [0, 0, 1, 0] ==> 2 Testing: [0, 1, 0, 1]
 * ==> 5 Testing: [1, 0, 0, 1] ==> 9
 * 
 * @author Jonathan
 *
 */
public class MissingInteger {

	public static int ConvertBinaryArrayToInt(List<Integer> binary) {
		String binValue = "";
		for (Integer integer : binary) {
			binValue += integer.toString();
		}
		return Integer.parseInt(binValue, 2);
	}

	@Test
	public void testAlgo() {
		List<Integer> testArray = new ArrayList<Integer>();
		testArray.add(0);
		testArray.add(1);
		testArray.add(1);
		testArray.add(0);
		assertTrue(ConvertBinaryArrayToInt(testArray) == 6);

	}

}
