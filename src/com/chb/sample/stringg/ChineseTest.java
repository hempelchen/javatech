package com.chb.sample.stringg;

/**
 * Created by renen-inc_hempel on 14-3-18.
 */
public class ChineseTest {
	public static void main(String[] args) {
		stringTest3();
	}

	public static void stringTest1(){
// 将一个中文汉字赋值给一个char变量
		char a = '中';
		char b = '文';
		char c = '测';
		char d = '试';
		char e = '成';
		char f = '功';
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		System.out.print(d);
		System.out.print(e);
		System.out.print(f);
	}

	public static void stringTest2(){
		// 将一个英文字母赋值给一个byte变量
		byte a = 'a';
		// 将一个中文汉字赋值给一个byte变量时，编译会报错
		// byte b = '中';

		System.out.println("byte a = " + a);
		// System.out.println("byte b = "+b);
	}

	public static void stringTest3(){
// 将一个中文汉字赋值给一个char变量
		char a = '中';
		char b = '文';
		char c = '测';
		char d = '试';
		char e = '成';
		char f = '功';
		System.out.print(a + b + c + d + e + f);
	}
}

