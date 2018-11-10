package sec09_verify;

import java.util.Arrays;

public class Song {

	
	private String title;
	private String artist;
	private String album;
	private String[] composer;
	private int year;
	private int track;
	
	void show() {
		
		System.out.println("노래제목 : "+this.title);
		System.out.println("가수: "+this.artist);
		System.out.println("앨범: "+this.album);
		System.out.println("작곡가: "+Arrays.toString(composer));
		System.out.println("년도: "+this.year);
		System.out.println("트랙번호: "+this.track);
		
	}
	
	
	//기본생성자 생성
	Song(){
		
	}
	
	Song(String title,String artist,String album,String[] composer,int year,int track){
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track=track;
		
	}
	   
	
	
	
}
