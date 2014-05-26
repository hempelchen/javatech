package com.chb.javapi.trycatchh;

/**
 * Created by renen-inc_hempel on 14-5-26.
 */
public class TryCatch {

	public static void main(String args[]) {
		int a =0;
		Long begin = 0L;
		Long end = 0L;
		Long times = 100000000L;

		begin = System.currentTimeMillis();
		System.out.println("begin at:\t" + begin);
		for (int i=0; i<times; i++) {
			try {
				a++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		end = System.currentTimeMillis();
		System.out.println("a = " + a);
		System.out.println("end at:\t" + end);
		System.out.println("\"try in for\" spend: " + (end - begin));

		begin = System.currentTimeMillis();
		System.out.println("begin at:\t" + begin);
		a=0;
		try {
			for (int i=0; i<times; i++) {
				a++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		System.out.println("a = " + a);
		System.out.println("end at:\t" + end);
		System.out.println("\"for in try\" spend: " + (end - begin));
	}
}
