package com.chb.javapi.stringg;

import java.util.StringTokenizer;

/**
 * Created by renen-inc_hempel on 14-5-19.
 */
public class StringPerform2 {
	private static final int times = 100000;

	public static void main(String args[]) {
		String orgStr = null;
		StringBuffer sb = new StringBuffer();

		for (int i=0; i<1000; i++) {
			sb.append(i);
			sb.append(";");
		}
		orgStr = sb.toString();

		Long begin = System.currentTimeMillis();
		System.out.println("begin at:\t" + begin);
		for(int i=0; i<times; i++) {
			orgStr.split(";");
		}
		Long end  = System.currentTimeMillis();
		System.out.println("end at:\t" + end);
		System.out.println("split spend: " + (end - begin));

		StringTokenizer st = new StringTokenizer(orgStr, ";");
		begin = System.currentTimeMillis();
		System.out.println("begin at:\t" + begin);
		for(int i=0; i<times; i++) {
			while (st.hasMoreTokens()) {
				st.nextToken();
			}
			st = new StringTokenizer(orgStr, ";");
		}
		end  = System.currentTimeMillis();
		System.out.println("end at:\t" + end);
		System.out.println("split spend: " + (end - begin));

		String tmp = orgStr;
		begin = System.currentTimeMillis();
		System.out.println("begin at:\t" + begin);
		for (int i=0; i<times; i++) {
			while (true) {
				String splitStr = null;
				int j = tmp.indexOf(';');
				if (j<0) break;;
				 splitStr = tmp.substring(0, j);
				tmp = tmp.substring(j+1);
			}
			tmp = orgStr;
		}
		end  = System.currentTimeMillis();
		System.out.println("end at:\t" + end);
		System.out.println("split spend: " + (end - begin));
	}
}

