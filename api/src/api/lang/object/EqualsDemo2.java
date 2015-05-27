package api.lang.object;

public class EqualsDemo2 {
	public static void main(String[] args) {
		Person p1 = new Person("800101-1555555");
		Person p2 = new Person("800101-1555555");
		String result;  // ����ƽ �޼ҵ� ���ζ� ���������� ����ƽȭ �Ǿ���.
		result = (p1 == p2) ? "p1 �� p2 �� ���� ���" : "p1 �� p2 �� �ٸ� ���";
		System.out.println("(p1==p2) �� ���� ����� : " + result);   // �ּҰ� ��
		
		result = (p1.equals(p2)) ? "p1 �� p2 �� ���� ���" : "p1 �� p2 �� �ٸ� ���";
		System.out.println("(p1.equals(p2)) �� ���� ����� : " + result);   // �������̵� �� equals()�� �� ��
		
	}
}
class Person{
	private String ssn; // �ֹι�ȣ
	public Person(String ssn) {
		this.ssn = ssn;
	}
	
	// alt + shift + s
	// generate getter setter
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// alt + shift + s
	// generate hashcode() and equals()
	@Override
	public boolean equals(Object obj) {
		
		/*
		 * Object �� ��� ������ Ÿ���� �ǹ��ϱ� ������
		 * �ݵ�� �ֹι�ȣ�� ���� �ִ� Person ������
		 * Ȯ���ؾ� �ֹι�ȣ ��ġ���θ� ���� �� �ֱ� ������
		 * ��üĳ���� ������ instanceof �� ����Ѵ�.
		 * �̷� ����� Valudation ��ȿ��üũ ��� �Ѵ�.
		*/
		if(obj != null && obj instanceof Person){ // obj �� Person�� �������� ������ �� �ƴϸ� ���� �� ��ȯ�Ѵ�.
			return ssn == ((Person)obj).ssn;
			
			// java.lang.Object �� ��ü ĳ������
			// ((��üŸ��)obj). .... �� ����� �̷�����.
		}else{
			return false;
		}
	}
	
	
}