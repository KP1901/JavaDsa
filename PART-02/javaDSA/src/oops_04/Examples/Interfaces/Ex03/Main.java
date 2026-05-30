package oops_04.Examples.Interfaces.Ex03;

//Task 3: Multiple Interfaces — Smart Phone System

public class Main {

	public static void main(String[] args) {

		Camera camera = new Phone();
		MusicPlayer music = new Phone();

		camera.takePhoto();
		music.playMusic();
	}
}