package com.generics;

public class MaxIntNo {
	public static Integer maxInteger(Integer a, Integer b, Integer c) {
		Integer max = a;

		if (a.compareTo(b) < 0)
			max = b;
		if (a.compareTo(c) < 0)
			max = c;

		return max;
	}

	public static void main(String[] args) {

		System.out.println("The maximum value of three integer no is :" + maxInteger(3, 5, 7));

	}

}
