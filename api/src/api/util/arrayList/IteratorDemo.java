package api.util.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String[] args) {
		// ArrayList list = new ArrayList();
		// �� ������ Ʋ���� ������ �÷��� Ÿ�Ե���
		// �������̽� Ÿ������ �����Ѵ�.
		// List �� import �� �� ��������
		// ��Ŭ���� ���ȵ� �� ���� �ִ� java.awt.List �� �����ϸ� �ȵ�.
		// �ι�° util ��Ű�� ���ùٶ�
		// ���׸� Ÿ���� ���� ������ Ÿ�� ��� ��� �뷣�� �޽����� ���.
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
			
		}
		
	}
}
