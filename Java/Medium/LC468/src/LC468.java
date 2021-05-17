/**
 * Leetcode #468 Problem Link - https://leetcode.com/problems/validate-ip-address/
 * 
 * @author ketanmalik
 * June 16 2020
 * */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LC468 {

	public static void main(String[] args) {
		System.out.println(validIPAddress("2001:0db8:85a3:0000:0000:8a2e:0370:7334"));
	}

	public static String validIPAddress(String IP) {
		String res;
		if (IP.contains(":")) {
			res = checkIPv6(IP);
		} else {
			res = checkIPv4(IP);
		}
		return res;
	}

	public static String checkIPv6(String IP) {
		Pattern p = Pattern.compile(
				"[0-9a-fA-F]{1,4}[:][0-9a-fA-F]{1,4}[:][0-9a-fA-F]{1,4}[:][0-9a-fA-F]{1,4}[:][0-9a-fA-F]{1,4}[:][0-9a-fA-F]{1,4}[:][0-9a-fA-F]{1,4}[:][0-9a-fA-F]{1,4}");
		Matcher m = p.matcher(IP);
		if (m.matches())
			return "IPv6";
		return "Neither";
	}

	public static String checkIPv4(String IP) {
		Pattern p = Pattern.compile(
				"([0-9]{1}|[1-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][0-5][0-5])[//.]([0-9]{1}|[1-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][0-5][0-5])[//.]([0-9]{1}|[1-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][0-5][0-5])[//.]([0-9]{1}|[1-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][0-5][0-5])");
		Matcher m = p.matcher(IP);
		if (m.matches())
			return "IPv4";
		return "Neither";
	}
}
