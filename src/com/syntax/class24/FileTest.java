package com.syntax.class24;

public class FileTest {

	public static void main(String[] args) {
File file=new WordFile();
file.close();
file.edit();
file.open();

File file2=new JavaFile();
file2.close();
file2.edit();
file2.open();

File file3=new PDFF();
file3.close();
file3.edit();
file3.open();
	}

}
