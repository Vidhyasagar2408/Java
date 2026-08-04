import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentApp {
    public static void main(String[] args) throws IOException {
        Student s = new Student(1, "Vidhya", 23, 85);
        String path = "C://FileHandler//Student.txt";
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Object Student;
        oos.writeObject(s);
        oos.close();
        fos.close();
    }
}
