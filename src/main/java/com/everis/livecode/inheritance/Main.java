package com.everis.livecode.inheritance;

public class Main {

	public static void main(String[] args) {

		Mother mother = new Son();
		Mother mother2 = new Daughter();
		// Son son = new Daughter();compiling error
		// Son son = new Mother(); compiling error
		// mother.createSon(); compiling error
		mother.create();
//		mother2.create();
		mother.createMother("everis Tetouan");
		mother.createMother("everis", "Tetouan");
		Laptop laptop = new Laptop();
		laptop.setOs(OS.WINDOWS);
		System.out.println(OS.WINDOWS.getValue());
		System.out.println(OS.WINDOWS.toString());
	}
}
