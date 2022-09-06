import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;
public class Contest2 {
	public static void removeSpamm(String f) {
		     // Your logic goes here
		ArrayList<String> spamm = new ArrayList<>();
		spamm.add("Null");
		spamm.add("Spamm");
		spamm.add("Block");
		String str = "";
		File files[] = (new File(folder)).listFiles();
		for(File file: files) {
			try {
				str = Files.readString(Paths.get(file.getAbsolutePath()));
				for(String temp: spam)
					str = str.replace(temp, "");
				FileWriter flwr = new FileWriter(file);
				flwr.write(str);
				flwr.close();
			} catch(IOException ie) {
				ie.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws Exception {
		String f = "C:/notes";
		removeSpamm(f);
	}
}
