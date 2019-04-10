package com.everis.livecode.abstraction;

public abstract class FirstAbstrClass {

	public void method() {
		System.out.println("only method in an abstract class");
		method2();
	}

	public abstract void method2();

}
