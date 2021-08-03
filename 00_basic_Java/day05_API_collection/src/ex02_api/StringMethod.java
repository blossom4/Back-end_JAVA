package ex02_api;

public class StringMethod {

	public static void main(String[] args) {
		String s1 = "Hi";
		String s2 = "YoungShin";
		System.out.println(s2.replace("gS", "sG"));
		System.out.println(s1.concat(s2));
		
		String space = "   asdf   asdf   asdf   ";
		System.out.println(space.trim());
		
		String s3 = "DreamCatcher Climbing";
		System.out.println(s3.substring(5, 13));
	}

}
