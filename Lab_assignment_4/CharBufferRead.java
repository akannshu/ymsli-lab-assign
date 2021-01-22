package lab_assignment_4;

import java.io.*;

public class CharBufferRead {
	public static void main(String[] args) {
		try {
			BufferedReader fileReader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter fileWriting = new BufferedWriter(new FileWriter(new File("C:\\Users\\ve00ym232\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\ymsli\\bin\\lab_assignment_4\\result.txt")));
			fileWriting.write(fileReader.readLine());
			
			System.out.println();
			
		} catch(IOException ex) {
			System.out.println("Some issue occured");
		}
	}
}
