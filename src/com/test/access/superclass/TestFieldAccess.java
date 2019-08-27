package com.test.access.superclass;

public class TestFieldAccess {
	public static void main(String[] args) {
		Fruit f = new Fruit();
		f.defaultInt += 1;
		f.protectedInt += 1;
		f.publicInt += 1;
	}
}
