package oops_04.Examples.Interfaces.Ex03;

public class Phone implements Camera, MusicPlayer {

	@Override
	public void takePhoto() {
		System.out.println("Taking Photo");
	}

	@Override
	public void playMusic() {
		System.out.println("Playing Music");
	}
}