package com.generics;

public class MaxNoWithGenerics<E extends Comparable<E>> {
	E a1, b2, c3;

	public MaxNoWithGenerics(E a1, E b2, E c3) {
		this.a1 = a1;
		this.b2 = b2;
		this.c3 = c3;
	}

	public static <E extends Comparable<E>> E maxOfNumber(E a1, E b2, E c3) {
		E max = a1;
		if (b2.compareTo(max) > 0)
			max = b2;
		if (c3.compareTo(max) > 0)
			max = c3;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("The maximum value of three Integer no is : " + maxOfNumber(65, 88, 93));
		System.out.println("The maximum value of three Float no is : " + maxOfNumber(7.9f, 3.8f, 2.9f));
		System.out.println("The maximum value of three String no is : " + maxOfNumber("maya", "piya", "ciya"));
	}
}
