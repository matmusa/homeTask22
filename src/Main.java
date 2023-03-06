import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Song song = new Song("Let it be", "The Beatles", ("\n" +
                "When I find myself in times of trouble\n" +
                "Mother Mary comes to me\n" +
                "Speaking words of wisdom, let it be.\n" +
                "\n" +
                "And in my hour of darkness\n" +
                "She is standing right in front of me\n" +
                "Speaking words of wisdom, let it be."));


        FileWriter fileWriter = new FileWriter(song.getTitle());
        fileWriter.close();





        try {
            FileReader fileReader = new FileReader(song.toString());
            System.out.println(fileReader);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.next());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}