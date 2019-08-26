// HashTable
// 09 May 2017
// Yaseen Hull

import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.lang.*;


public class Main
{
	public static void main(String[] args)
	{
		/**
		 * Instances of hashFunction and Entropy classes created
		 */ 
		hashFunction hf = new hashFunction();
		
		Entropy hw = new Entropy();
		Entropy h1 = new Entropy();
		Entropy h2 = new Entropy();
		Entropy hs = new Entropy();
		
		/**
		 * testdata contains all contacts for phonebook
		 * each contact has address, number and name, must be split to establish key
		 */ 
		
		try
		{
			BufferedReader input = new BufferedReader(new FileReader("testdata"));
			
			hf.table(20011);
			int i = 0;
			String data;
					
			while( (data=input.readLine()) != null ) //while runs as long as theres input data
			{
				i++;
				
				String[] parts = data.split("\\|"); //split each line read in based on symbol

				String name = parts[2];
				
				//System.out.println(name.hashCode()); prints out hash values of hash functions
				
				/**
				 * Four instances of Entropy created to execute methods for each hash function
				 */
				
				hw.Occur(hf.hashworst(name));
				h1.Occur(hf.hash1(name));
				h2.Occur(hf.hash2(name));
				hs.Occur(name.hashCode()); // fourth hash function 
			}
		
			hw.CalE((double)i);
			h1.CalE((double)i);
			h2.CalE((double)i);
			hs.CalE((double)i);
			
						 
			return;
		}
		
		/**
		 * @throws filenotfoundexception throws exception if input file is not found
		 */


		catch(IOException ioexception)
		{
			System.out.println("File input error occured!");
		}
		
		/**
		 * @throws ioexception throws exception if input is incorrect
		 */
		
		catch(NullPointerException nullpointerexception)
		{
			System.out.println("Not Found");
		}

	}

	public static void quitError(String msg)
	{
		System.out.println(msg);
		System.out.println("Program will now quit. ");
		System.exit(0);
	}

}
