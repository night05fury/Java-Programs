import java.io.IOException;
import java.nio.file.*;



public class CopyFile {

	public static void main(String[] args) throws IOException  {
		Path sourcepath = Paths.get("C:\\Users\\ANAND\\eclipse-workspace\\NIO\\temp.txt");
		try {
		Files.createFile(sourcepath);
		Path destinationepath = Paths.get("C:\\Users\\ANAND\\eclipse-workspace\\NIO\\destination.txt");
		Files.copy(sourcepath, destinationepath, StandardCopyOption.REPLACE_EXISTING);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
