import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Version3 {
    public static void main(String[] args) {
        String path1 = "C:\\FileHandler\\input.txt";
        String path2 = "C:\\FileHandler\\output.txt";

        FileReader fr = null;
        FileWriter fw = null;

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            fr = new FileReader(path1);
            fw = new FileWriter(path2);

            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);

            String data;

            while ((data = br.readLine()) != null) {
                bw.write(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (bw != null) bw.close();

                if (fr != null) fr.close();
                if (fw != null) fw.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
