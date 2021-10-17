package youtube.java.tutorials;

import java.util.Scanner;

public class °¡À§¹ÙÀ§º¸ {

	public static void main(String[] args) {
		String Ã¶¼ö , ¿µÈñ ;
		Scanner hand = new Scanner(System.in);
		System.out.println("¢º°¡À§¹ÙÀ§º¸ °ÔÀÓ¢¸");
		System.out.println("Ã¶¼öºÎÅÍ ½ÃÀÛÇÏ¼¼¿ä");
		System.out.print("Ã¶¼ö>>");
		Ã¶¼ö=hand.next();
		System.out.print("¿µÈñ>>");
		¿µÈñ=hand.next();
		
		if(Ã¶¼ö.equals("°¡À§")) {
			if(¿µÈñ.equals("°¡À§"))
				System.out.println("ºñ°å½À´Ï´Ù.");
			else if(¿µÈñ.equals("¹ÙÀ§"))
				System.out.println("¿µÈñ°¡ ÀÌ°å½À´Ï´Ù.");
			else if(¿µÈñ.equals("º¸"))
				System.out.println("Ã¶¼ö°¡ ÀÌ°å½À´Ï´Ù.");
		}
		
		if(Ã¶¼ö.equals("¹ÙÀ§")) {
			if(¿µÈñ.equals("°¡À§"))
				System.out.println("Ã¶¼ö°¡ ÀÌ°å½À´Ï´Ù.");
			else if(¿µÈñ.equals("¹ÙÀ§"))
				System.out.println("ºñ°å½À´Ï´Ù.");
			else if(¿µÈñ.equals("º¸"))
				System.out.println("¿µÈñ°¡ ÀÌ°å½À´Ï´Ù.");
		}
		
		if(Ã¶¼ö.equals("º¸")) {
			if(¿µÈñ.equals("°¡À§"))
				System.out.println("¿µÈñ°¡ ÀÌ°å½À´Ï´Ù.");
			else if(¿µÈñ.equals("¹ÙÀ§"))
				System.out.println("Ã¶¼ö°¡ ÀÌ°å½À´Ï´Ù.");
			else if(¿µÈñ.equals("º¸"))
				System.out.println("ºñ°å½À´Ï´Ù.");
		}
		
		
		
		
		
	}

}
