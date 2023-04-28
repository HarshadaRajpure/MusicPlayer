package com.jspiders.multiplayerApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class songOperations {
private static List<Song> playList=new ArrayList<Song>();
private static Scanner scanner=new Scanner(System.in);
private static int choice;
private static Song song;
public void displayAllSong() {
	for(int i=0;i<playList.size();i++) {
		System.out.println(i+1 +" " + playList.get(i).getsongName());
	}
}


public void addSong() {
	System.out.println("How many songs do you want to add");
	choice=scanner.nextInt();
	for(int i=1;i<=choice;i++) {
		song=new Song();
		
		System.out.println("Enter name of song");
		String songName=scanner.next();
		song.setsongName(songName);
		
		System.out.println("Enter singer name");
		String singerName=scanner.next();
		song.setsingerName(singerName);
		
		System.out.println("duration of song");
		double duration=scanner.nextDouble();
		song.setduration(duration);
		
		System.out.println("From which movie song is");
		String movie_album=scanner.next();
		song.setmovie_album(movie_album);
		
		System.out.println("Lyricist of song");
		String lyricist=scanner.next();
		song.setlyricist(lyricist);
	}
}

public void removeSong() {
	System.out.println("select song to remove");
	displayAllSong();
	choice=scanner.nextInt();
	playList.remove(choice-1);
	
}


}
