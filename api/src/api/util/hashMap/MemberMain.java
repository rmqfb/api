package api.util.hashMap;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ���");
		String id  = scanner.next();
		System.out.println("��й�ȣ�� �Է��ϼ���");
		String password  = scanner.next();
		System.out.println("�̸��� �Է��ϼ���");
		String name  = scanner.next();
		System.out.println("���̸� �Է��ϼ���");
		int age  = scanner.nextInt();
		System.out.println("�ּҸ� �Է��ϼ���");
		String addr  = scanner.next();
		
		// ��ü�� �����ؼ� �ϼ���Ű��
		// ��ü�� �����ϴ� ������ �� �Ѱ���, ��ü�� �ҷ����� �޼ҵ带 Ȱ���ϱ� ���ؼ�
		MemberService service = new MemberServiceImpl();
//		id = "hong";
//		password = "pass";
//		name = "ȫ�浿";
//		age = 20;
//		addr = "�����";    // ������ ������ ��
		service.join(id, password, name, age, addr);
		
		System.out.println("ȸ�������� �Ǿ����ϴ�.");
		System.out.println("�α����� �ϼ���");
		System.out.println("ID �� �Է��ϼ���");
		id = scanner.next();
		System.out.println("��й�ȣ�� �Է��ϼ���");
		password = scanner.next();
		// ��ü�� ȣ���ϴ� �޼ҵ�� �ϼ� ��Ű��
		
		service.login(id, password);
		
	}
}
