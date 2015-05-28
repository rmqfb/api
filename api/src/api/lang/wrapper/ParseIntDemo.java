package api.lang.wrapper;

/*
 * JDK 1.5 (�ڹٹ��� 5)���� ���Ե� ����ڽ�(autoboxing) �������
 * ��ȯ���� �⺻���� ���� wrapper class �̸�..
 * ���� ���̰� ����.
 * �׷��� parseInt() �� valueOf() �� ���̰� ����.
*/
public class ParseIntDemo {
	public static void main(String[] args) {
		// ���ͷ� ���� �⺻������ ĳ���ý� ��ȯ���
		// �� String => int
		int num1 = Integer.parseInt("200");
		int num2 = Integer.parseInt("200");
		int result = num1 + num2;
		System.out.println(result);
		
		// �⺻���� ���������� ����ȯ�ϴ� ���(ĳ���� ���� ���)
		// Integer num3 = (Integer)result;
		Integer num3 = result;
		System.out.println("�⺻���� ���������� ����ȯ�� ��� : " + num3);
		
		int num4 = 2 + num3;
		System.out.println("�������� �⺻������ ������ : " + num4);
		
		int num5 = Integer.parseInt("Hello");
		/*
		 * num5 �� java.lang.NumberFormatException: �� �߻��Ѵ�.
		 * �� ����� ���ڰ��� ���������� ����ȯ�� �õ��ߴ��� ���θ�
		 * ����ϰ� ����� �ؾ� �Ѵ�.  >> try catch �� ����ó�� ����� ��(����ڵ�-���� �߻� ����) >> ���ڸ� �Է��ϱ� 
		*/ 
		System.out.println(num5); // ���ڷ� ���ٲٴ� ����
		
	}
}
