package com.syntax.class24;

public abstract class File {
	//Create a class File that will have the following behaviors:
	//open, edit, close. Edit and close are implemented method
	//while open is an abstract. Create 3 subclasses: JavaFile, 
	//WordFile, PDFFile that will provide specific implementation
	//of open behaviour: Example: to open .java file we need notepad++
	//or sublime text, to open .doc file we need Microsoft word to be installed etc

	 void edit() {
		 System.out.println("File edit");
		
	}
	void close() {
		System.out.println("file close");
	}
       abstract void  open();
}


class WordFile extends File{
	
	void open() {
		System.out.println("to open .doc file we need Microsoft word to be installed etc ");
	}
}
	class JavaFile extends File{
		void open() {
			System.out.println("to open .java file we need notepad++ ");
		}
	}
		class PDFF extends File{
			void open() {
				System.out.println(" we need PDFF word to be installed etc ");
			}
		}
	
