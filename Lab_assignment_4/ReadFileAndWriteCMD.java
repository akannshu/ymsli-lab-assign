package lab_assignment_4;

import java.io.*;

public class ReadFileAndWriteCMD {
	public static void main(String[] args) {

		try {

			FileInputStream inputImg = new FileInputStream(
					"C:\\Users\\ve00ym232\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\ymsli\\bin\\lab_assignment_4\\passImg.jpeg");
			FileOutputStream copyImg = new FileOutputStream(
					"C:\\Users\\ve00ym232\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\ymsli\\bin\\lab_assignment_4\\copyImg.jpeg");

			int byteData=0;

			while (byteData != -1) {
				byteData = inputImg.read();
				copyImg.write(byteData);
			}

			System.out.println("File Succesfully copied");
			copyImg.close();
			inputImg.close();

		} catch (IOException ex) {
			System.out.println("File not Found");
		}
	}
}
