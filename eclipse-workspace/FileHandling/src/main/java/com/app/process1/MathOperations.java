package com.app.process1;


public class MathOperations {
	public int add(int i,int j) {
		return i+j;
	}
	public int mul(int i,int j) {
		return i*j;
	}
	public boolean validateName(String custName) {
		if(null!=custName && custName.equals("james")) {
			return true;
		}
		return true;
	}
}
