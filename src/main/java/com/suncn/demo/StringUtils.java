package com.suncn.demo;

import org.apache.commons.lang.StringEscapeUtils;

public class StringUtils {
	public static void main(String[] args) {
		String string = StringEscapeUtils.escapeHtml("<");
		System.out.println(string);
		
	}
}
