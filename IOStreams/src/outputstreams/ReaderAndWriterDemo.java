package outputstreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReaderAndWriterDemo {

	public static void main(String[] args) throws Exception {

		FileReader fr = null;
		FileWriter fw = null;

		fr = new FileReader("D:\\IO streams/myfile.txt");
		fw = new FileWriter("D:\\\\IO streams/newFile.txt");
		
		int ch;
		
		while((ch=fr.read())!=-1)
		{
			fw.write(ch);
		
		}
		fr.close();
		fw.close();
		
	}

}
