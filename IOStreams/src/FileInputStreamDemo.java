import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {

		FileInputStream fil = null;
		try {
			fil = new FileInputStream(new File("D:\\IO streams/myfile.txt"));
			System.out.println("File Opened");

			int i;
			while ((i = fil.read()) != -1) {
				System.out.print((char) i);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fil.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("File Closed");
		}
	}
}
