package mar27;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writetext_File {

	public static void main(String[] args) throws IOException {
		File f = new File("e:/sarika.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("I am Sarika ");
		bw.newLine();
		bw.write("i have born and broughtup in hyd");
		bw.newLine();
		bw.write("i belong to necular family");
		bw.flush();
		bw.close();
	}

}
