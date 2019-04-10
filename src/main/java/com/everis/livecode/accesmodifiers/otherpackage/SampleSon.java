package com.everis.livecode.accesmodifiers.otherpackage;

import com.everis.livecode.accesmodifiers.Sample;

public class SampleSon extends Sample {

	public void method() {
		System.out.println(this.protectedMember);
	}
}
