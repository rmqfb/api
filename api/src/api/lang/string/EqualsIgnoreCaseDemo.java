package api.lang.string;

/*
 * java.lang.String
 * ��ҹ��� ���о��� ��
*/
public class EqualsIgnoreCaseDemo {
	public static void main(String[] args) {
		
		// �� ����� ��ҹ��� ���������� ���Ѵ�.
		System.out.println("Hello".equals("hello") ? "�����ϴ�." : "�ٸ��ϴ�.");
		
		// �� ����� ��ҹ��� ���̸� ���� �ʴ´�.
		// ��ҹ��� ������ ����.
		System.out.println("Hello".equalsIgnoreCase("hello") ? "�����ϴ�." : "�ٸ��ϴ�.");
	}
}
