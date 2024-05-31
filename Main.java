import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static ArrayList<String> getTxtsFilesForFolder(final File folder) {
        ArrayList<String> files = new ArrayList<String>();
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                continue;
            } else {
                String filename = fileEntry.getName();
                if (filename.contains(".txt")) {
                    files.add(filename);
                }
            }
        }
        return files;
    }


    public static boolean hasLineContainsWord(String lineOfText, String searchWord) {
        if (searchWord.contains("*")) {

            return lineOfText.toLowerCase().contains(searchWord.toLowerCase().replace("*", ""));
        }
        if (searchWord.contains("?")) {

            String[] splited = lineOfText.split("\\s+");
            Integer searchWordLength = searchWord.length();
            String searchWordWithoutQuestionMarks = searchWord.replace("?", "");
            for (String word: splited) {
                if (word.toLowerCase().startsWith(searchWordWithoutQuestionMarks.toLowerCase()) && word.length() == searchWordLength) {
                    return true;
                }
            }
        }

        String[] splited = lineOfText.split("\\s+");
        for (String word: splited) {
            if (searchWord.toLowerCase().equals(word.toLowerCase())) {
                return true;
            }
        }
        return false;
    }


    public static boolean searchWordInFile (File file, String searchWord) {
        boolean wordFound = false;
        try {
            Scanner scanner = new Scanner(file);
            Integer line = 1;
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if (hasLineContainsWord(data, searchWord)) {
                    wordFound = true;
                    System.out.printf(
                            (char)27+"[01;32mPlik o nazwie %s zawiera tekst pasujący do wzorca %s w linii nr. %d (%s) \n"+(char)27+"[00;00m",
                            file.getName(),
                            searchWord,
                            line,
                            data
                    );
                }
                line++;
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return wordFound;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");;
        String search;
        System.out.print("Podaj słowo do wyszukania: ");
        search = scanner.next();

        if (search.replace("*","").replace("?", "").isEmpty()) {
            System.out.print("Wymagana jest co najmniej jeden znak r zny od [*,?]");
            return;
        }

        System.out.printf("Przeszukuj pliki dla frazy [%s] \n", search);

        String pathname = System.getProperty("user.dir") + "/src";
        ArrayList<String> txtFiles = getTxtsFilesForFolder(new File(pathname));

        System.out.println("_______");
        boolean hasAnyFileMeetPattern = false;
        for (Object filename : txtFiles) {
            hasAnyFileMeetPattern = searchWordInFile(new File(pathname + "/" + filename), search);
        }
        if (!hasAnyFileMeetPattern) {
            System.out.printf((char)27+"[01;31mBrak wyników dla szukanego słowa %s \n"+(char)27+"[00;00m", search);
        }
        System.out.println("_______");
    }
}
