package com.chb.sample.initorder;

/**
 * Created by renen-inc_hempel on 14-3-13.
 */
public class TestOrder {
	// 静态变量
	public static TestB b = new TestB();

	// 静态初始化块
	static {
		System.out.println("静态初始化块");
	}

	// 静态变量
	public static TestA a = new TestA();

	public static void main(String[] args) {
		new TestOrder();
	}
}

class TestA {
	public TestA() {
		System.out.println("Test--A");
	}
}

class TestB {
	public TestB() {
		System.out.println("Test--B");
	}
}

