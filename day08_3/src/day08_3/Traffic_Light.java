package day08_3;
//자동 import : Ctrl+Shift+O
import java.util.Scanner;

public class Traffic_Light {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("☆★☆★신호등프로그램☆★☆★");
		System.out.println("신호를 입력하세요~");
		System.out.println("빨간불:1 , 초록불:2 , 노란불:3");
		System.out.println("신호 입력:");
		int sign = sc.nextInt();
		String result=(sign==1)?"정지하세요~":(sign==2)?"출발하세요~":"서행하세요~";
				
		System.out.println(result);
		sc.close();
		
		
	}

}
