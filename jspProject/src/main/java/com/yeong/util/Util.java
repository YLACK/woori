package com.yeong.util;

public class Util {
	public static boolean str2Int(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static String HTML2str(String parameter) {
		return parameter.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
	}
	
	
	
}