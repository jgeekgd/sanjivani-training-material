package home;

public class Neighbour {
	public void accessFatherVariable() {
		Father mrRoy = new Father();
		mrRoy.setCar("Maruti 800"); //private
		mrRoy.setMangoTree("Alphanso");  //public
		mrRoy.setSmartTv("Sony Bravia"); //private
		System.out.println(mrRoy.car); //can access protected
		System.out.println(mrRoy.mixerGrinder); //can access default variable since in same package
		System.out.println(mrRoy.getCar());
		System.out.println(mrRoy.getMangoTree());
		System.out.println(mrRoy.getSmartTV());
	}
}
