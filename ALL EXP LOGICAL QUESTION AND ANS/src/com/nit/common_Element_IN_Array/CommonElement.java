/**
 * FIND COMMON ELEMENT IN TWO ARRAYS
 */

package com.nit.common_Element_IN_Array;

import java.util.Arrays;
import java.util.HashSet;

public class CommonElement {
	
	public static void main(String[] args) throws Exception{
		Integer array1[]= {1,4,7,9,2};
		Integer array2[]= {1,7,3,4,5};
	
		 HashSet<Integer> set1 = new HashSet<>(Arrays.asList(array1));
		 
	        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(array2));
	 
	        set1.retainAll(set2);
	 
	        System.out.println(set1); 
	        
	        
//	        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
//	        
//	        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
//	 
//	        HashSet<String> set = new HashSet<String>();
//	 
//	        for (int i = 0; i < s1.length; i++)
//	        {
//	            for (int j = 0; j < s2.length; j++)
//	            {
//	                if(s1[i].equals(s2[j]))
//	                {
//	                    set.add(s1[i]);
//	                }
//	            }
//	        }
//	 
//	        System.out.println(set); 
		
		}
	}


