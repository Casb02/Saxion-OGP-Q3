package nl.saxion.oop.week1;

import nl.saxion.app.CsvReader;
import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1200, 600);
    }

    public void run() {
        // Load videos from csv file.
        ArrayList<Video> videos = new ArrayList<Video>();

        CsvReader csvReader = new CsvReader("./Exercise2/youtubevideos.csv");
        csvReader.setSeparator(';');
        csvReader.skipRow();
        while (csvReader.loadRow()) {
            Video video = new Video(
                    csvReader.getString(0),
                    csvReader.getString(1),
                    csvReader.getString(2),
                    csvReader.getInt(3),
                    csvReader.getInt(4),
                    csvReader.getInt(5)
            );
            videos.add(video);
        }


        int menuInput = -1;
        do {
            SaxionApp.clear();
            SaxionApp.printLine("***************************************");
            SaxionApp.printLine("* 1) Show watchlist ");
            SaxionApp.printLine("* 2) Watch video");
            SaxionApp.printLine("* 0) Exit program");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");
            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {
                for (Video video : videos) {
                    int index = videos.indexOf(video) + 1;
                    SaxionApp.print(index + ") " + video.toString());
                    SaxionApp.printLine(" [" + (video.getWatched() ? "WATCHED" : "NOT WATCHED") + "] \n", (video.getWatched() ? Color.GREEN : Color.RED));
                }

                SaxionApp.pause();
            } else if (menuInput == 2) {

                SaxionApp.printLine("Please enter the number of the video you want to watch: ");
                int videoNumber = SaxionApp.readInt();
                videoNumber--;
                if (videoNumber >= 0 && videoNumber < videos.size()) {
                    videos.get(videoNumber).watch();
                }
                SaxionApp.pause();
            } else {
                SaxionApp.printLine("Goodbye!");
            }

        } while (menuInput != 0);
    }

}