package com.actitime.generic;

import java.io.IOException;

public class DemoGenericLibrary {

	public static void main(String[] args) throws IOException {
FileLib f=new FileLib();
String url = f.getPropertyData("url");
String un = f.getPropertyData("username");
String pw = f.getPropertyData("password");
System.out.println(url);
System.out.println(un);
System.out.println(pw);
f.setExcelData("CreateCustomer", 1, 4, "java");
System.out.println(f.getExcelData("CreateCustomer",1,4));


	}

}
