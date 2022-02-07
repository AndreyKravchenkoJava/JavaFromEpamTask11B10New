package project;


import java.util.TreeSet;


public class MainClass {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        TreeSet<RoadWay> roadWays = new TreeSet<>();
        readFile.readFile(roadWays);
        System.out.println("All list: " + roadWays);
        System.out.println("Minimum distance from Dnipro to another city: " + roadWays.first());

    }
}
