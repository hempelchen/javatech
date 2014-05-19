package com.chb.sample.paramter;

/**
 * Created by renen-inc_hempel on 14-3-12.
 */
class ParentClass {
	public int i = 10;
}
public class SubClass extends ParentClass {
	public int i = 30;

	public static void main(String[] args) {
		ParentClass parentClass = new SubClass();
		SubClass subClass = new SubClass();
		System.out.println("parentClass.i = " + parentClass.i);
		System.out.println("subClass.i = " + subClass.i);
		System.out.println("parentClass.i + subClass.i = " + (parentClass.i + subClass.i));
	}
}