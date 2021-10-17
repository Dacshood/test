package day09;

public class If_else {

	public static void main(String[] args) {
		int a=3;
		if(a>5) {
			System.out.println("네 맞습니다");
			System.out.println("잘하셨어요");
		}
		//else는 바로위에 오는 if문의 조건만을 부정한다
		
		else {
			System.out.println("아니요 틀렸습니다");
			System.out.println("다시 한번 생각해보세요");
		}
		System.out.println("계속해서 문제를 풀어주세요");
	}

}
