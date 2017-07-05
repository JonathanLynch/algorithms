	package algorithms;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


/**

 * @author Jonathan
 *
 */
public class PassingCars {
	
	
    public static int solution(int A, int B, int K)  {
    	int count = 0;
    	for(int i = A; i <= B; i++) {
    		if((i % K) == 0) {
    			count ++;
    		}	
    	}
    	return count;
    }

    
    @Test
    public void testAlgo() {
    	assertTrue(solution(6, 11, 2) == 3);
    	assertTrue(solution(0, 11, 2) == 6);
    	assertTrue(solution(0, 11, 3) == 4);
    }
    
}
