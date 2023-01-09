package feature.of.java.interfacedemo;


public class DigitalCamera implements Usb {

	@Override
	public void charge() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendData() {
	System.out.println("Copying Media files from PC to DigiCam");	
	}

	@Override
	public void recevieData() {
	System.out.println("Copying Media files from DigiCam to PC");

	}

}
