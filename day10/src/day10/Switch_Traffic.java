package day10;

import java.util.Scanner;

public class Switch_Traffic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȣ�� ���α׷�");
		System.out.println("������:1, �����:2, �ʷϺ�:3");
		System.out.println("��ȣ:");
		int sign=sc.nextInt();
		switch(sign) {
		case 1:
			System.out.println("�������Դϴ�. �����ϼ���");
			break;
		case 2:
			System.out.println("������Դϴ�. break ��������");
			break;
		case 3:
			System.out.println("�ʷϺ��Դϴ�. ����ϼ���");
			break;
		default :
			System.out.println("�ٽ� �Է��ϼ���");
			

			
		}
		
		
		
	}

}