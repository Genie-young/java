package chap18;

import java.io.*;

public class SystemInTest {

	public static void main(String[] args) {

		try {
			int result = 0;
			result = System.in.read();
			System.out.println(result);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
