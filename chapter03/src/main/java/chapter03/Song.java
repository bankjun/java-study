package chapter03;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song() {
		// some code1
		// some code2
		// some code3
		// 이렇게 기본 생성자에서 반드시 사용되는 것이 있다면 이걸 카피 페이스트 하는 것이아니라
		// 이 생성자를 this() 를 통해서 호출하여 사용하는 것임. 중복은 최대한 줄이는것이 좋은 코드
	}
	public Song(String title, String artist) {
//		this.title = title;
//		this.artist = artist;
		this(title, artist,"","",0,0);
	}
	public Song (String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void show() {
		System.out.println(artist + " " + title + " (" + album + ", " + year + ", " + track + "번 track, "
				+ composer + "작곡" + ")");
	}
	
}
