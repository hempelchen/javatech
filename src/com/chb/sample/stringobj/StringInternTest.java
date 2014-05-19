package com.chb.sample.stringobj;

/**
 * Created by renen-inc_hempel on 14-3-14.
 */
public class StringInternTest {
	public static void main(String[] args) {
		// 使用char数组来初始化a，避免在a被创建之前字符串池中已经存在了值为"abcd"的对象
		String a = new String(new char[] { 'a', 'b', 'c', 'd' });
		String b = a.intern();
		if (b == a) {
			System.out.println("b被加入了字符串池中，没有新建对象");
		} else {
			System.out.println("b没被加入字符串池中，新建了对象");
		}
	}
}
