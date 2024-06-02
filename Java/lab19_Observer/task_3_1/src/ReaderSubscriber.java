import java.util.HashMap;
import java.util.Map;

public class ReaderSubscriber implements Subscriber {

    private Map<FileReader, String> longestLine = new HashMap<>();
    private Map<FileReader, String> longestWord = new HashMap<>();
    private Map<FileReader, Integer> wordCount = new HashMap<>();
    private Map<FileReader, String> longestWordLine = new HashMap<>();


    @Override
    public void update(FileReader fileReader, String line) {
        if (line.length() > longestLine.getOrDefault(fileReader, "").length()) {
                longestLine.put(fileReader, line);
        }

        String[] words = line.split("\\s+");
        String longestInLine = "";
        for (String word : words) {
            if (word.length() > longestInLine.length()) {
                longestInLine = word;
            }
        }
        if (longestInLine.length() > longestWord.getOrDefault(fileReader, "").length()) {
            longestWord.put(fileReader, longestInLine);
            longestWordLine.put(fileReader, line);
        }
        wordCount.put(fileReader, wordCount.getOrDefault(fileReader, 0) + words.length);
    }

    public void getInfo(FileReader fileReader){
        System.out.println("\nGetting info on "+fileReader);
        if (longestLine.containsKey(fileReader)){
            System.out.println("Longest line: "+ longestLine.get(fileReader));
            System.out.println("Longest word: "+ longestWord.get(fileReader));
            System.out.println("Word count: "+ wordCount.get(fileReader));
            System.out.println("Line with longest word: "+ longestWordLine.get(fileReader));
        }
    }
}
