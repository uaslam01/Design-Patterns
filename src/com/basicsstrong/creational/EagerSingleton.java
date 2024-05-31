package com.basicsstrong.creational;

import java.io.Serializable;

public class EagerSingleton implements Serializable {

	private static final EagerSingleton singleton = new EagerSingleton();
	static {
		System.out.println("singleton static");

	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	private int val;

	private EagerSingleton() {
		System.out.println("singleton created");
		val = 10;
	}

	public static EagerSingleton getInstance() {
		return singleton;
	}

	protected Object readResolve() {
		return singleton;
	}

	private static class SingletonHelper {
		private static final EagerSingleton INSTANCE = new EagerSingleton();
	}

	public static EagerSingleton getInstanceThroughInnerClass() {
		return SingletonHelper.INSTANCE;
	}

}
