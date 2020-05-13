/*
Leetcode #1108

Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0" 
 
@author ketanmalik
May 13 2020  
 */

public class LC1108 {
	public static void main(String args[]) {
		System.out.println(defangIPaddr("1.1.1.1"));
		System.out.println(defangIPaddr("192.168.17.43"));
		System.out.println(defangIPaddr("127.0.0.1"));
		System.out.println(defangIPaddr("135.58.24.17"));
		System.out.println(defangIPaddr("243.164.89.28"));

	}

	public static String defangIPaddr(String address) {
		StringBuffer res = new StringBuffer();
		for (char c : address.toCharArray()) {
			if (c == '.')
				res.append("[.]");
			else
				res.append(c);
		}
		return res.toString();
	}

	/*
	 * Shorter approach but takes more time
	 * 
	 * return address.replaceAll("//.","[.]");
	 */

}
