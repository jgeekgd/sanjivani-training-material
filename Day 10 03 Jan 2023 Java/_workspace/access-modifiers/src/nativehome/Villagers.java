package nativehome;

import home.Father;

//Different Package Non Sub Class
public class Villagers {
	public static void main(String[] args) {

		Father mrRoy = new Father();
		mrRoy.setCar("Maruti 800");
		mrRoy.setMangoTree("Alphanso");
		mrRoy.setSmartTv("Sony Bravia");
		System.out.println(mrRoy.mangoTree); // can only access public modified members
		System.out.println(mrRoy.getCar());
		System.out.println(mrRoy.getMangoTree());
		System.out.println(mrRoy.getSmartTV());

	}
}
