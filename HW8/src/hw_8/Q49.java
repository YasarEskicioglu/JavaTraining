package hw_8;

import java.io.*;

// Class name Backup changed with Q49
public class Q49 {
	public void performBackup() {
		try {
			throw new IOException ("Disk not Found");
		}catch (Exception e) {
			try {
				throw new FileNotFoundException("File not found");
			} catch (FileNotFoundException e) {  // z1
				System.out.print("Failed");
			}
		}
	}
	
	public static void main(String[] args) {
		new Q49().performBackup(); //z2
	}
}
