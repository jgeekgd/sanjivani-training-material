package basicofinheritance;

public class WhatIsInheritance {
	public static void main(String[] args) {

		Father mrRoy=new Father("2BHK Villa","999999USD","Maruti 800");
		//System.out.println(mrRoy.displayFatherProperty());
		
		Father mrJames=new Son("2BHK Villa","999999USD","Maruti 800","MS London","Dimond Business","Kawasaki Ninja");
		System.out.println(mrJames.displayFatherProperty());
		
		System.out.println(mrJames instanceof Son);
		System.out.println((Son) mrJames instanceof Father);
		System.out.println(mrJames instanceof Father);
	}
}
