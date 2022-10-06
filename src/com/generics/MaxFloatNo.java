package com.generics;

public class MaxFloatNo {

	public static Float maxFloat(Float a, Float b, Float c) {
		Float max = a;

		if (a.compareTo(b) < 0)
			max = b;
		if (a.compareTo(c) < 0)
			max = c;

		return max;
	}

	public static void main(String[] args) {

		System.out.println("The maximum value of three float no is :" + maxFloat(3.7f, 5.4f, 7.2f));

	}

}