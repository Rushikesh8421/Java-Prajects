//Write a Java program to find out whether the given String is Palindrome or not. 
//A palindrome is a number, string or a sequence which will be the same even after
//you reverse the order. For example, RACECAR, if spelled backward will be same as
//RACECAR.
package firstprog;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		boolean pali = true;
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to check Palindrome:");
		str = scan.nextLine();
		int len = str.length();
		for(int i=0;i<=len/2;i++) {
			if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(len-i-1))) {
				pali = false;
				break;
			}
		}
		
		System.out.println(str+" is palindrome "+pali);
		scan.close();

	}

}
