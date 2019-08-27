package com.test.access.derivedclass;

import com.test.access.superclass.Fruit;

public class TestOther {
	public static void main(String[] args) {
		Fruit f = new Fruit();
		f.publicInt += 1;
	}
}
