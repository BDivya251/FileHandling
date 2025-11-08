package com.app.process1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteOpr {
public static void main(String[] args) throws IOException {
	File f = new File("text.txt");
	FileWriter write = new FileWriter(f);
	write.append("Hello from the file");
	write.close();
	FileReader read = new FileReader(f);
	int ch=0;
	while(((ch=(int)read.read())!=-1)) {
		System.out.println((char)ch);
	}
}
}
