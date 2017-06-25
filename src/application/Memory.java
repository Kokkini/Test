package application;

import java.io.*;
import java.util.ArrayList;

public class Memory {

	String memoryFile;

	Memory(String filePath_) {
		memoryFile = filePath_;
	}

	public void write(String s) {
		FileWriter fw;
		try {
			fw = new FileWriter(memoryFile, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(s);
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<String> readAll() {
		ArrayList<String> Foo = new ArrayList<String>();
		FileReader fr;
		try {
			fr = new FileReader(memoryFile);
			BufferedReader br = new BufferedReader(fr);
			String s;
			while ((s = br.readLine()) != null) {
				Foo.add(s);
			}
			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Foo;
	}
}
