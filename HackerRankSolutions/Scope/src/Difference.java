/**
 * 
 */

/**
 * @author Sheheryar Ahmad
 */
public class Difference {
	
	private int[] elements;
  	public int maximumDifference;
  	
 // Add your code here
  	
  	/**
  	 * @param a
  	 */
  	public Difference(int[] a) {
  	  elements = a;
  	}
  	
  	/**
  	 * Compute difference
  	 */
  	public void computeDifference() {
  	  int max = 0;
  	  for (int i = 0; i < elements.length-1; i++) {
  	      for (int j = i+1; j < elements.length; j++) {
  	          int diff = Math.abs(elements[i] - elements[j]);
  	          if (diff > max) 
  	              max = diff;
  	      }
  	  }
  	  maximumDifference = max;
  	}

}
