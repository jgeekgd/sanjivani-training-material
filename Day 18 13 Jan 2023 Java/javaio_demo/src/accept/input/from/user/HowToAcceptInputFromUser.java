package accept.input.from.user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowToAcceptInputFromUser {
	public static void main(String[] args) {

		System.out.println("Enter your name");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name=null;;
		try {
			name = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name);
		
	}
}
