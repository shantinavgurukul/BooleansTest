package com.booleans.test;

public class Booleandemo2 {
	public static void main(String[] args) {
		boolean pehla = true;
		boolean dusra = false;
		System.out.println(pehla && dusra);
		System.out.println(pehla || dusra);
		if (!pehla) {
			System.out.println("yeh kya huaa");

		} else {
			System.out.println("pta nahi kya huaa");
		}
		System.out.println(!dusra);
		if (pehla && dusra) {
			System.out.println("yes");
		}
		System.out.println(pehla || dusra);
		System.out.println(!pehla);
		System.out.println(!dusra);

	}
}
