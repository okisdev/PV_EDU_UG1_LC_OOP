import java.util.Arrays;
import java.util.Scanner;

public class RecordingSort {

    public static void main(String[] args) {

        String songTitle;
        String artist;
        int playingTime;

        Recording[] list = new Recording[10];

        Scanner sc = new Scanner(System.in);

            for (int i = 0; i < list.length; i++) {
                System.out.println("Please enter the song title:");
                songTitle = sc.nextLine();

                System.out.println("Please enter the artist:");
                artist = sc.nextLine();

                System.out.println("Please enter the playing time (by second):");
                playingTime = sc.nextInt();

                list[i] = new Recording(songTitle, artist, playingTime);
            }

        int which = 0;

        System.out.println("Sort by 1. Title 2. Artist 3. Playing Time, please enter a number, such as 1");
        which = sc.nextInt();

        int a, b;
        int highestVal = list.length - 1;
        // bubble sort
        for (a = 0; a < highestVal; a++) {
            for (b = 0; b < highestVal; b++) {
                int c = b + 1;

                // sorts by titles
                if (which == 1) {
                    // compares title of one song with the song immediately after it
                    if (list[b].getSongTitle().compareTo(list[c].getSongTitle()) > 0) {
                        // reorders the songs if necessary
                        Recording temp = list[b];
                        list[b] = list[c];
                        list[c] = temp;
                    }
                }
                // sorts by artist
                else if (which == 2) {
                    // compares name of one artist with the name of the artist immediately after it
                    if (list[b].getArtist().compareTo(list[c].getArtist()) > 0) {
                        // reorders the songs if necessary
                        Recording temp = list[b];
                        list[b] = list[c];
                        list[c] = temp;
                    }
                }
                // sort by playing time
                else if (which == 3) {
                    // compares one song's playing time with playing time of the song immediately after it
                    if (list[b].getPlayingTime() > list[c].getPlayingTime()) {
                        // reorders the songs if necessary
                        Recording temp = list[b];
                        list[b] = list[c];
                        list[c] = temp;
                    }
                }
                else {
                    System.out.println("Invalid Input.");
                }
            }
        }

        System.out.println("System.out.println(\"Song: Title: \" + list[i].getTitle() + \". Artist: \" + list[i].getArtist() + \". Playing time: \"\n" + "\t\t\t\t\t+ list[i].getPlayingTime() + \" seconds.\"");

    }
}
