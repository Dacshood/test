package Day08_1;

public class Equality_sign_operation {

	public static void main(String[] args) {
		double a=3.14; //실수형 변수 a에 3.14 저장
		double b=5.15; //실수형 변수 b에 5.14 저장
		System.out.println(a==b); //a랑b가 같아?
		System.out.println(a!=b); //a랑b가 다른가?
		
		String  c1="Hello JAVA!"; //c1 문자열 변수에 "Hello JAVA!" 값 저장
		System.out.println(c1 == "Hello JAVA!"); //true
		System.out.println(c1.equals("Hello JAVA!")); //true
		//문자열 비교할때는 ==등가비교연산자를 사용하지 않음 되긴함
		//String 문자열클래스 안에있는 메서드(기능) 문자열.eqauls(비교문자열)
		System.out.println(c1.equals("hello java!")); //false 문자열은 대소문자 구분
	}

}
