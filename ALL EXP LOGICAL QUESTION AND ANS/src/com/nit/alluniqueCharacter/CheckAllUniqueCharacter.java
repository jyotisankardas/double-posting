/**
 * 
 * WRITE A PROGRAM TO FIND OUT IF THE GIVEN STRING HAS ALL UNIQUE CHARACTER
 */

package com.nit.alluniqueCharacter;

import java.util.Scanner;

public class CheckAllUniqueCharacter {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a String --> ");
		String msg=scn.nextLine();
		boolean unique=false; 
		int count=0;//abac aab
		for(int i=0;i<=msg.length()-1;i++) {
			for(int j=0;j<=msg.length()-1;j++) {
				if(i!=j && msg.charAt(i)==msg.charAt(j)) {
					count=count+1;
				}
			}
		}
				if(count>1) {
					System.out.println("not unique");
				}
				else {
					System.out.println("unique");
				}
			}
		}
					
			
		
		


