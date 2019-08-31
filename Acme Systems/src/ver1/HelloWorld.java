package ver1;

public class HelloWorld {

	public static void main(String[] args) {
			System.out.println("Hello from Eclipse");
			System.out.println("New print statement");
			heyNow();
			String name = "Emily";
			whatFor(name);
	}
	
	public static void heyNow() {
		String msg = "Hey Now!";
		System.out.println(msg);
	}

	public static void whatFor(String str) {
		System.out.println(str + ", what for?");
	}
}
