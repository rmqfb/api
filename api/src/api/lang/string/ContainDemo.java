package api.lang.string;

/*
 * java.lang.String
 * contain(s) : s ��� ���ڰ� ���ԵǾ����� ���� üũ
*/
public class ContainDemo {
	public static void main(String[] args) {
		String str = "abcde";
		/*
		 * (���ǽ�) ? "��" : "����" ;
		*/
		System.out.println(str.contains("f") ? "f �� ����" : "f �� ������");
	}
}
