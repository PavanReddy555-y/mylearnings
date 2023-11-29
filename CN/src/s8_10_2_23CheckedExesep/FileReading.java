

package s8_10_2_23CheckedExesep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReading implements FileCollect {

	@Override
	public void readFile(String name) throws FileNotFoundException {
		try {
			FileInputStream stream = new FileInputStream(name);
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();
			System.out.println("File not Found in that path");
			throw new FileNotFoundException("f n");
			
		}
		
	}

	
}
