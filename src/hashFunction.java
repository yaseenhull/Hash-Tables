// HashTable
// 09 May 2017
// Yaseen Hull

public class hashFunction{
	
	private int tableSize;

	public int table ( int size) {
	
		this.tableSize = size;
	
	return tableSize;
 	
	}
	/**
	 * @param key is the only parameter to the hash function
	 * @return returns the remainder of the hash value divided by the table size
	 */
	public int hash1 (String key) 
	{
		
		int hashVal = 0;
		
		for (int i = 0; i < key.length(); i++)
			
			hashVal += key.charAt(i);
		
		return hashVal%tableSize;
	}
	/**
	 * @param key is the only parameter to the hash function
	 * @return returns the remainder of the hash value divided by the table size
	 */

	public int hash2 (String key) 
	{

		int hashVal = 0;
		

		for (int i =0; i < key.length(); i++)
		
			hashVal = (37*hashVal) + key.charAt(i);

		return hashVal%tableSize;
	}
	/**
	 * @param key is the only parameter to the hash function
	 * @return returns the remainder of the hash value divided by the hash value
	 */

	public int hashworst (String key )
	{
		
		int hashVal = 0;	

		for( int i = 0; i < key.length(); i++)
			
			hashVal += key.charAt(i);

		return hashVal/hashVal;
	}
	
	


}
