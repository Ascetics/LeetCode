package com.test.access.derivedclass;

import com.test.access.superclass.Fruit;

public class Apple extends Fruit {
	public Apple() {
		super();
	}
	
	public void access() {
		super.protectedInt += 1;
		super.publicInt += 1;
	}
}
