package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class KeyboardInput {
	private BufferedReader br;
	private BufferedWriter bw;

	public KeyboardInput() {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			FileOutputStream fos = new FileOutputStream("student_info.csv", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			bw = new BufferedWriter(osw);

			String buffer = new String();
			String id, name, place, email, mobile;
			boolean more = true;
			while(more) {
				for(int i=0; i<30; i++) System.out.println();
				
				System.out.println("STUDENT INFORMATION SYSTEM");
				System.out.println("--------------------------");
				System.out.println();
				
				System.out.print("ID:         ");
				id = br.readLine();
				System.out.print("Name:       ");
				name = br.readLine();
				System.out.print("Place:      ");
				place = br.readLine();
				System.out.print("Email-id:   ");
				email = br.readLine();
				System.out.print("Mobile No.: ");
				mobile = br.readLine();

				buffer = id+",\""+name+"\",\""+place+"\",\""+email+"\",\""+mobile+"\"\r\n";
				bw.write(buffer);
				
				System.out.print("More [y/n]: ");
				more = br.readLine().toLowerCase().startsWith("y");
			}

			br.close();
			bw.close();
		} catch(FileNotFoundException e) {
			System.err.println("File Not Found");
		} catch(IOException e) {
			System.err.println("IO Exception");
		} catch(Exception e) {
			System.err.println(e);
		}
	}

	public static void main(String[] args) {
		new KeyboardInput();
	}
}
