package algorithms;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;


/**
that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not occur in A.

For example, given:

  A[0] = 1
  A[1] = 3
  A[2] = 6
  A[3] = 4
  A[4] = 1
  A[5] = 2
the function should return 5.

Assume that:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * @author Jonathan
 *
 */
public class OnesAndZeros {
	
	
    public static int solution(int[] A)  {
    	Arrays.sort(A);
    	int i = 1;
    	for (i = 1; i <= A.length; i++) {
    		if(Arrays.binarySearch(A,i) < 0) {
    			return i;
    		}
		}
    	return i;
    }

    
    @Test
    public void testAlgo() {
    	int testArray[] = {1,3,6,4,1,2};
    	assertTrue(solution(testArray) == 5);
    	int testArray2[] = {1,3,6,4,1,2,5,6,7,8,9,10,11,12,13,14,16,15,17,21,20,19,18,-1,-500,-4};
    	assertTrue(solution(testArray2) == 22);
    	int testArray3[] = {1};
    	assertTrue(solution(testArray3) == 2);

    }
    
}
