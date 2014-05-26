package com.chb.javapi.referencee;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/**
 * Created by renen-inc_hempel on 14-5-26.
 */
public class SoftReferencee {

	private  static ReferenceQueue<MyObject>  softQueue;

	public static void main(String args[]) {
		MyObject obj = new MyObject();
		softQueue = new ReferenceQueue<MyObject>();

		SoftReference<MyObject> softRef = new SoftReference<MyObject>(obj, softQueue);
		new CheckRefQueue().start();
		obj = null;
		System.gc();
		System.out.println("After GC: Soft Get = " + softRef.get());
		System.out.println("分配大块内存");
		byte[] b = new byte[6*1024*1024];
		System.out.println("After new byte[]: Soft Get = " + softRef.get());
	}

	static class MyObject {
		@Override
		protected void finalize() throws Throwable {
			super.finalize();
			System.out.println("MyObject's finalize called");
		}

		@Override
		public String toString(){
			return "I am MyObject";
		}
	}

	static class CheckRefQueue extends Thread {

		@Override
		public void run(){
			Reference<MyObject> obj = null;
			try {
				obj = (Reference<MyObject>) softQueue.remove();
			} catch ( InterruptedException e) {
				e.printStackTrace();
			}

			if(obj != null) {
				System.out.println("Object for SoftReference is " + obj.get());
			}
		}
	}
}



