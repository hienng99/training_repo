package com.company;

import org.apache.commons.lang3.StringUtils;

public class Test {

	public static void main(String[] args) {

		boolean result = StringUtils.isNumeric("abc");
		System.out.println(result ? "This is a number.":"This is not a number.");

	}

}
