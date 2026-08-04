import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
	
	static final String FILE_NAME = "C:\\FileHandler\\Students.txt";
	
	public void addStudent(Student student) throws IOException {
		FileWriter fw = null;
		try {
			fw = new FileWriter(FILE_NAME, true);
			student.getRollNumber();
			student.getName();
			student.getMarks();
			fw.write(student.getRollNumber() + ", " + student.getName() + ", " + student.getMarks() + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		student.getRollNumber();
		fw.close();
	}
	
	public void displayStudent() throws IOException {
		try {
			FileReader fr = new FileReader(FILE_NAME);
			try (BufferedReader br = new BufferedReader(fr)) {
				String line;
				while ((line = br.readLine()) != null) {
					String[] data = line.split(",");
					System.out.println(data[0] + "\t" + data[1] + "\t" + data[2]);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
