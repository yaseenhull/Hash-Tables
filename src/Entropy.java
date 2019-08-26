// HashTable
// 09 May 2017
// Yaseen Hull

import java.util.*;
import java.lang.*;


public class Entropy
{
	/**
	 * Instance of Hashmap created 
	 */

	Map<Integer, Integer> frequency = new HashMap();

	/**
	 * @param h is the first paramter to the Occur method
	 * Occur method calculates the number of occurences of hash values 
  	 */
	public void Occur(int h)
	{
			
		
		if (frequency.containsKey(h))
		{
			
			frequency.put(h,frequency.get(h)+1);
		}
		else
		{
			frequency.put(h,1);
		}
	
	}
	/**
	 * @param count is the first parameter to the CalE method
	 * CalE calculates the entropy of the hash function
	 * @return returns the entropy 
 	 */
	public double CalE(double count)
	{
		double probability = 0;
		double entropy = 0;
		double log;
		
		for (int k : frequency.values())
		{	
			probability = (double)k/count;
			log  = (-1)*probability*(Math.log(probability));
			entropy += log;			 
			
		}
	//System.out.println(probability);
	//System.out.println(log);
	System.out.println(entropy);
	return entropy;
	}

}
		
