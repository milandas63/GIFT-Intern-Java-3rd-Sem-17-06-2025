package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	String inputFile = "Buddhism.pdf";
	String outputFile = "b.pdf";
	
	public CopyFile() {
		try {
			File iFile = new File(inputFile);
			long size = iFile.length();
			double fivePc = .05 * size;
			long count = 0L;

			InputStream is = new FileInputStream(iFile);
			OutputStream os = new FileOutputStream(outputFile);

			int each;
			while( (each=is.read()) != -1 ) {
				os.write(each);
				count++;
				if(count>=fivePc) {
					System.out.print(".");
					count = 0;
				}
			}

			os.close();
			is.close();
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		}
	}

	public static void main(String[] args) {
		new CopyFile();
	}
}
