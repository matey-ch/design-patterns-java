import java.io.*;

public class Reader {
    private static Reader instance = null;
    private static BufferedReader reader;
    private static BufferedWriter writer;

    public static Reader getInstance(){
        if (instance == null){
            instance = new Reader();
        }
        return instance;
    }

    private Reader(){
    }

    public void openFile(String filename) throws IOException {
        closeFile();
        reader = new BufferedReader(new FileReader(filename));
        writer = new BufferedWriter(new FileWriter(filename, true));
    }

    public void write(String text) throws IOException {
        writer.write(text);
    }

    public String readLine() throws IOException {
        return reader.readLine();
    }

    public void closeFile() throws IOException {
        if (reader != null) {
            reader.close();
        }
        if (writer != null) {
            writer.close();
        }
    }


}
