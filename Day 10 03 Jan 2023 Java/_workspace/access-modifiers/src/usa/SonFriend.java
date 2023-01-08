package usa;

import home.Father;

public class SonFriend {
	public void accessSonAsset() {
		Father mrRoy = new Father();
		System.out.println(mrRoy.mangoTree);
		//System.out.println(mrRoy.car); //cannot acces even though protected since SonFriend is not direct child of Father.
		
	}

}
