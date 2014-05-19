package com.chb.sample.paramter;

/**
 * Created by renen-inc_hempel on 14-3-12.
 */
public final class ParamTest {
	// 初始值为0
	protected int num = 0;

	// 为方法参数重新赋值
	public void change(int i) {
		i = 5;
	}

	// 为方法参数重新赋值
	public void change(ParamTest t) {
		ParamTest tmp = new ParamTest();
		tmp.num = 9;
		t = tmp;
	}

	// 改变方法参数的值
	public void add(int i) {
		i += 10;
	}

	// 改变方法参数属性的值
	public void add(ParamTest pt) {
//		pt.num += 20;
		ParamTest tmp = new ParamTest();
		tmp.num = 9;
		pt = tmp;
		pt.num = 9;
	}

	public static void main(String[] args) {
		ParamTest t = new ParamTest();

		// 为基本类型参数重新赋值
		t.change(t.num);
		System.out.println(t.num);
		// 为引用型参数重新赋值
		t.change(t);
		System.out.println(t.num);

		// 改变基本类型参数的值
		t.add(t.num);
		System.out.println(t.num);
		// 改变引用类型参数所指向对象的属性值
		t.add(t);
		System.out.println(t.num);
	}
}
