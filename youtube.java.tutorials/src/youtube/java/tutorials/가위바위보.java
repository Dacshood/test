package youtube.java.tutorials;

import java.util.Scanner;

public class ���������� {

	public static void main(String[] args) {
		String ö�� , ���� ;
		Scanner hand = new Scanner(System.in);
		System.out.println("������������ ���Ӣ�");
		System.out.println("ö������ �����ϼ���");
		System.out.print("ö��>>");
		ö��=hand.next();
		System.out.print("����>>");
		����=hand.next();
		
		if(ö��.equals("����")) {
			if(����.equals("����"))
				System.out.println("�����ϴ�.");
			else if(����.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else if(����.equals("��"))
				System.out.println("ö���� �̰���ϴ�.");
		}
		
		if(ö��.equals("����")) {
			if(����.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else if(����.equals("����"))
				System.out.println("�����ϴ�.");
			else if(����.equals("��"))
				System.out.println("���� �̰���ϴ�.");
		}
		
		if(ö��.equals("��")) {
			if(����.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else if(����.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else if(����.equals("��"))
				System.out.println("�����ϴ�.");
		}
		
		
		
		
		
	}

}
