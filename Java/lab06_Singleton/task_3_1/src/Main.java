import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


            Reader reader = Reader.getInstance();
            reader.openFile("test1.txt");

            System.out.println("File 1:");
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

            RandomNumberAdder.add();
            reader.write("\nMain was working on this file too.");

            System.out.println("\n"+"File 2:");
            reader.openFile("test2.txt");
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());

            System.out.println("\n"+"File 1:");
            reader.openFile("test1.txt");
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }


            reader.closeFile();

    }
}
