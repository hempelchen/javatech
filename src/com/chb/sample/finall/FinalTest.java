package com.chb.sample.finall;

/**
 * Created by renen-inc_hempel on 14-3-17.
 */
public class FinalTest {
	// 在定义时初始化
	public final int A = 10;

	public final int B;
	// 在初始化块中初始化
	{
		B = 20;
	}

	// 静态常量，在定义时初始化
	public static final int STATIC_C = 30;

	public static final int STATIC_D;
	// 静态常量，在静态初始化块中初始化
	static {
		STATIC_D = 40;
	}

	public final int E;

	public static int STATIC_F;

	// 在构造器中初始化
	public FinalTest() {
		E = 50;
		// 静态变量也可以在构造器中初始化
		STATIC_F = 60;

		// 给final的变量第二次赋值时，编译会报错
		// A = 99;
		// STATIC_C = 99;
	}

	// 静态变量不能在初始化块中初始化
//	public static final int STATIC_G;
//	{
//	    STATIC_G = 70;
//	}

	// final变量未被初始化，编译时就会报错
	// public final int H;

	// 静态final变量未被初始化，编译时就会报错
	// public static final int STATIC_I;

	public static void main(String[] args) {
		new FinalTest();
	}
}
