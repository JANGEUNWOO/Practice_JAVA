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
		
		System.out.println("�뷡���� : "+this.title);
		System.out.println("����: "+this.artist);
		System.out.println("�ٹ�: "+this.album);
		System.out.println("�۰: "+Arrays.toString(composer));
		System.out.println("�⵵: "+this.year);
		System.out.println("Ʈ����ȣ: "+this.track);
		
	}
	
	
	//�⺻������ ����
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
