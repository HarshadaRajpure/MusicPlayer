package com.jspiders.multiplayerApp;

public class Song {
private int id;
private String songName;
private String singerName;
private double duration;
private String movie_album;
private String lyricist;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id=id;
}
public String getsongName() {
	return songName;
}
public void setsongName(String songName) {
	this.songName=songName;
}
public String getsingerName() {
	return singerName;
}
public void setsingerName(String singerName) {
	this.singerName=singerName;

}
public double getduration() {
	return duration;
}
public void setduration(double duration) {
	this.duration=duration;
}
public String getmovie_album() {
	return movie_album;
}
public void setmovie_album(String movie_album) {
	this.movie_album=movie_album;
}
public String getlyricist() {
	return lyricist;
}
public void setlyricist(String lyricist) {
	this.lyricist=lyricist;
}
}