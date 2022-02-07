package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;


public class ReadFile {

    public void readFile(TreeSet<RoadWay> roadWays) {
        try {
            Scanner scanner = new Scanner(new File("Map.txt"));
            do {
                String allSentence = scanner.nextLine();
                String[] arrayWord = allSentence.split("\\s");
                String stringNumber = allSentence;
                stringNumber = stringNumber.replaceAll("\\D+", " ");
                stringNumber = stringNumber.replaceAll("^\\s", "");
                String[] arrayNumberString = stringNumber.split("\\s");
                int[] ArrayNumber = Arrays.stream(arrayNumberString).mapToInt(Integer::parseInt).toArray();
                roadWays.add(new RoadWay(arrayWord[0], arrayWord[1], ArrayNumber[0]));
            } while (scanner.hasNext());
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
