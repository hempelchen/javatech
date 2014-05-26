package com.chb.javapi.stringg;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by renen-inc_hempel on 14-5-16.
 */
public class StringPerform1 {
	public static void main(String args[]) {
		List<String> handler = new ArrayList<String>();

		for (int i = 0; i < 1000; i++) {
//			HugeStr h =  new HugeStr();
			ImprovedHugeStr h = new ImprovedHugeStr();
			handler.add(h.getSubString(1, 5));

		}
	}

	static class HugeStr {
		private String str = new String(new char[100000]);

		public String getSubString(int begin, int end) {
			return str.substring(begin, end);
		}
	}

	static class ImprovedHugeStr {
		private String str = new String(new char[100000]);

		public String getSubString(int begin, int end) {
			return new String(str.substring(begin, end));
		}
	}
}
