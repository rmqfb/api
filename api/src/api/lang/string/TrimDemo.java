package api.lang.string;

/*
 * java.lang.String �� �ִ�
 * trim() �޼ҵ�� ���ڿ� �յ� ������ �����Ѵ�.
 * ���ڿ� ������ ������ �������� �ʴ´�.
*/
public class TrimDemo {
	public static void main(String[] args) {
		String str = "   Hello Java World !!   ";
		System.out.println("trim() ���� : " + str.trim());
		String str2 = "   Hello Java World   ";
		System.out.println("�޼��� ü������ ���� : " +str2.trim().replace("Java", "JSP"));
		
		/*
		 * trim() ó�� �����ϴ� ���� String Ÿ���̸�
		 * String �� �޼ҵ带 �����ؼ� ����� �� �ִµ�,
		 * �̰��� �޼ҵ� ü���̶�� �ϸ�,
		 * ���� Sting Ŭ������ ���� �޼ҵ带 ������ ��
		 * ���������� trim() �� ������Ѽ�
		 * �����Ѵ�.
		*/
		System.out.println("trim()�� ������� �ʴ� ��� : " + "  Hello Java ".indexOf("J")); 
		System.out.println("trim()�� ����� ��� : " + "  Hello Java ".trim().indexOf("J"));
	}
}
