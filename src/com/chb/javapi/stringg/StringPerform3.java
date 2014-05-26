package com.chb.javapi.stringg;

/**
 * Created by renen-inc_hempel on 14-5-19.
 */
public class StringPerform3 {
	private static final int times = 1000000000;

	public static void main(String args[]) {
		String orgStr = "Java String charAt() indexOf testing...";

		Long begin = System.currentTimeMillis();
		System.out.println("begin at:\t" + begin);
		for (int i = 0; i < times; i++) {
			int len = orgStr.length();
			if (orgStr.charAt(0) == 'a'
					    && orgStr.charAt(1) == 'b'
					    && orgStr.charAt(2) == 'c') {
				;
			}

			if (orgStr.charAt(len - 1) == 'a'
					    && orgStr.charAt(len - 2) == 'b'
					    && orgStr.charAt(len - 3) == 'c') {
				;
			}
		}
		Long end = System.currentTimeMillis();
		System.out.println("end at:\t" + end);
		System.out.println("charAt spend: " + (end - begin));

		begin = System.currentTimeMillis();
		System.out.println("begin at:\t" + begin);
		for (int i = 0; i < times; i++) {
			if (orgStr.startsWith("abcdef")) {
				;
			}
			if (orgStr.endsWith("abcdef")) {
				;
			}
		}
		end = System.currentTimeMillis();
		System.out.println("end at:\t" + end);
		System.out.println("startWith/endWith spend: " + (end - begin));
	}
}

