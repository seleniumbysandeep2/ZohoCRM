package com.actitime.pom;

  public class A {

	private int i;  	//declaration

	public A(int j) {
		i=j;        	//initialization
	}

public int getValue() {     //Giving read access means we can only Read the value
		return i;
	}
public void setValue(int k) {   //Giving write access means we can set the value
		i=k;         //utilization
	}
}

  