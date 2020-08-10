package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		String number = String.valueOf(num);
		char [] digits = number.toCharArray();
		long sum = 0;
		for (int i = 0; i < digits.length; i++) {
			int currentDigit = Character.getNumericValue(digits[i]);
			long currentDigitRaised = (long) Math.pow(currentDigit, digits.length);
			sum += currentDigitRaised;
		}
		return sum == num;
	}
}
