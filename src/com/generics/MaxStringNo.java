package com.generics;

public class MaxStringNo {

	public static String maxString(String aa1, String bb2, String cc3) {
		String max = aa1;

		if (aa1.compareTo(bb2) < 0)
			max = bb2;
		if (aa1.compareTo(cc3) < 0)
			max = cc3;

		return max;
	}

	public static void main(String[] args) {

		System.out.println("The maximum value of three String no is :" + maxString("maya", "piya", "siya"));

	}

}