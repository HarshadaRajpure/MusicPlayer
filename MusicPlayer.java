package com.jspiders.multiplayerApp;

import java.util.Scanner;

public class MusicPlayer {
private static boolean loop=true;
private static int choice;
private static Scanner scanner=new Scanner(System.in);
private static songOperations operations=new songOperations();
public static void main(String[] args) {
	musicPlayer();
}

private static void musicPlayer() {
	while(loop) {
		System.out.println("==========MENU============");
		System.out.println("1.Add/remove song\n"
							+"2.play song \n"
							+"3.Edit song \n"
							+"4.Exit");
		
		choice=scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("===MENU====");
			System.out.println("1.Add song \n"
								+"2.Remove Song"
								+"3.Go back");
			choice=scanner.nextInt();
		switch(choice) {
		case 1:
			operations.addSong();
			break;
		
		case 2:
			operations.removeSong();
			break;
		case 3:
			musicPlayer();
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		break;
		
		case 2:
			System.out.println("===MENU===");
			System.out.println("1.play all songs \n"
								+"2.select song\n"
								+"3.play random song"
								+"4.go back");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				musicPlayer();
				break;
				default:
					break;
	}
		case 3:
			break;
		case 4:
			System.out.println("Thank you..!!!");
			loop=false;
			break;
			
			default:
				System.out.println("Invalid choice");
				break;
}
}
}
}