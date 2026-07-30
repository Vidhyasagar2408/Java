import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Version1 {
    public static void main(String[] args) throws IOException {
        String path1 = "C:\\FileHandler\\input.txt";
        String path2 = "C:\\FileHandler\\output.txt";

        FileInputStream fis = new FileInputStream(path1);
        FileOutputStream fos = new FileOutputStream(path2);

        int data;

        while ((data = fis.read()) != -1) {
            fos.write(data);
        }

        fis.close();
        fos.close();
    }
}