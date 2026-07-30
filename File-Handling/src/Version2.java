import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Version2 {
    public static void main(String[] args) {
        String path1 = "C:\\FileHandler\\input.txt";
        String path2 = "C:\\FileHandler\\output.txt";

        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader(path1);
            fw = new FileWriter(path2);

            int data;

            while ((data = fr.read()) != -1) {
                fw.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) fr.close();
                if (fw != null) fw.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
