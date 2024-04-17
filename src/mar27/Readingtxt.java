package mar27;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readingtxt {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:/Sarika1.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str = br.readLine())!= null) {
			System.out.println(str);
		}

	}

}
