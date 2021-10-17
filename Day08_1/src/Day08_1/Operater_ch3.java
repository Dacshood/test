package Day08_1;

public class Operater_ch3 {

	public static void main(String[] args) {
		int a=1; //a변수에 1값 저장
		System.out.println(a);
		
		a++; //a값 1증가 : 후위형
		System.out.println(a); //이 때, a값은 2
		System.out.println(++a); //a의 값 1증가, 전위형 : 증가가 먼저 출력 : 3
		System.out.println(a++); //a의 값 1증가, 후위형 : 증가가 나중에 출력 : 3
		System.out.println(a); //12line에서 a의값이 증가되었으므로 출력 : 4
		
	}

}
