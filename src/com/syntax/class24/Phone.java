package com.syntax.class24;

public abstract class Phone {

	public void call() {// method that has body is implemented method
		System.out.println("Phone can make a call");
	}
	public void text() {
		System.out.println("phone can sand text");
	}
	//without body unimplemented method or abstract method
	 public abstract void takePicture();
	 public abstract void playMusic();
}
class iPhone extends Phone{
	public void takePicture() {
		System.out.println("iPone take picturer");
	}
	@Override
	public void playMusic() {
		System.out.println("iPhonr paly music");
	}
	class Samsung extends Phone{
		public void takePicture() {
			System.out.println("Samsung take picturer");
		}
		@Override
		public void playMusic() {
			System.out.println("Samsung paly music");
		}
	}
}
