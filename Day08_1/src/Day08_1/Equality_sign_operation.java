package Day08_1;

public class Equality_sign_operation {

	public static void main(String[] args) {
		double a=3.14; //�Ǽ��� ���� a�� 3.14 ����
		double b=5.15; //�Ǽ��� ���� b�� 5.14 ����
		System.out.println(a==b); //a��b�� ����?
		System.out.println(a!=b); //a��b�� �ٸ���?
		
		String  c1="Hello JAVA!"; //c1 ���ڿ� ������ "Hello JAVA!" �� ����
		System.out.println(c1 == "Hello JAVA!"); //true
		System.out.println(c1.equals("Hello JAVA!")); //true
		//���ڿ� ���Ҷ��� ==��񱳿����ڸ� ������� ���� �Ǳ���
		//String ���ڿ�Ŭ���� �ȿ��ִ� �޼���(���) ���ڿ�.eqauls(�񱳹��ڿ�)
		System.out.println(c1.equals("hello java!")); //false ���ڿ��� ��ҹ��� ����
	}

}
