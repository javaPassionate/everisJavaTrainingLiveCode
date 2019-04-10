package com.everis.livecode.inheritance;


public class Son extends Mother {

	public void createSon() {
		System.out.println("create son method");
	}

	@Override
	public void create() {
		System.out.println("create from son");
	}
}
