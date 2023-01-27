package cg.Static;

public class StaticMethods {
	static void home(){
		System.out.println("Hello");
	}
	static void play() {
		System.out.println("play music");
	}
	public void hello() {
		System.out.println("hello world");
	}
		
	public static void main(String args[]) {
		System.out.println("hello ganga");
		StaticMethods.home();
		StaticMethods s1 = new StaticMethods();
		s1.hello();
	}	
	static {
		System.out.println("hello sai");
		StaticMethods.play();
		StaticMethods.home();
			}
}