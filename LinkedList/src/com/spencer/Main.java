package com.spencer;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    Song dancingQ = new Song("Dancing Queen", 190);
	    Song forOnce = new Song("For Once in My Life", 200);
	    Song dreamOn = new Song("Dream On", 300);
	    Song sos = new Song("S.O.S", 270);
	    Song fernando = new Song("Fernando", 340);
	    Song stop = new Song("Stop", 450);
	    Song mama = new Song("Mama", 230);

	    Album abba = new Album("Abbas greatest");
	    abba.addSongToAlbum(dancingQ);
	    abba.addSongToAlbum(sos);
	    abba.addSongToAlbum(fernando);

	    Album spice = new Album("Spice Girls");
	    spice.addSongToAlbum(forOnce);
	    spice.addSongToAlbum(dreamOn);
	    spice.addSongToAlbum(stop);
	    spice.addSongToAlbum(mama);

        LinkedList<Song> playlist = new LinkedList<>();
        playlist.add(dancingQ);
        playlist.add(fernando);
        playlist.add(mama);
        playlist.add(forOnce);

        printMenu();
        switchOn(playlist);
    }

    private static void printMenu() {
        System.out.println("Playlist loaded.....");
        System.out.println("0 --> Quit");
        System.out.println("1 --> Skip next song");
        System.out.println("2 --> Skip previous song");
        System.out.println("3 --> Replay current song");
        System.out.println("4 --> List songs in playlist");
        System.out.println("5 --> Remove current song");
        System.out.println("6 --> View menu");
        System.out.println("============================");
    }

    private static void printPlayList(LinkedList<Song> playlist) {
        for (int i=0; i < playlist.size(); i++) {
            System.out.println("Song " + i+1 + ": " + playlist.get(i).getTitle());
        }
    }

    private static void switchOn(LinkedList<Song> playlist) {
        boolean isPowerOn = true;
        boolean isForward = true;
        ListIterator<Song> currentList = playlist.listIterator();

        while (isPowerOn) {
            System.out.println("What do you wish to do?");
            int action = scanner.nextInt();
            switch (action) {
                case 0:
                    System.out.println("Bye, thanks for listening");
                    isPowerOn = false;
                    break;
                case 1:
                    if (!isForward) {
                        if (currentList.hasNext()) {
                            currentList.next();
                        }
                        isForward = true;
                    }
                    if (currentList.hasNext()) {
                        System.out.println("Now playing " + currentList.next().getTitle());
                        break;
                    }
                    System.out.println("You have reached the end of the playlist.");
                    break;
                case 2:
                    if (isForward) {
                        if (currentList.hasPrevious()) {
                            currentList.previous();
                        }
                        isForward = false;
                    }
                    if (currentList.hasPrevious()) {
                        System.out.println("Now playing " + currentList.previous().getTitle());
                        break;
                    }
                    System.out.println("You are already at the start of the playlist.");
                    isForward = true;
                    break;
                case 3:
                    if (isForward) {
                        System.out.println("Now playing " + currentList.previous().getTitle());
                        isForward = false;
                        break;
                    }
                    if (!isForward) {
                        System.out.println("Now playing " + currentList.next().getTitle());
                        isForward = true;
                        break;
                    }
                    break;
                case 4:
                    printPlayList(playlist);
                    break;
                case 5:
                    currentList.remove();
                    System.out.println("removed current song, playlist is now: ");
                    printPlayList(playlist);
                    break;
                case 6:
                    printMenu();
                    break;
            }
        }
    }
}
