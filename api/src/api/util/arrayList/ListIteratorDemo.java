package api.util.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator<String> it = list.listIterator(list.size());
		//ListIterator<String> it = list.listIterator(5); ���ظ� ���� ���� �ۼ���.
		/* �ٷδ� �ȳ����ϱ�..
		 * Java API �� ����
		 * java.util.List ���������� ListIterator �� ����
		 * listIterator()
		 * listIterator(int index) 
		 * �ΰ��� ���°� �ִµ�..
		 * �Ķ���Ͱ� ���� ���� �������� �� �� ������ ������
		 * ����� �ǰ�, �Ķ����(list.size)�� ������
		 * �� �Ķ���Ͱ� �ε��� ������ �ؼ� �ٷ� ���������� ��µȴ�.
		 * ����, �Ķ���Ͱ� �ִ� ���¸� ��õ��. 
		*/

		/*System.out.println("������ ���");
		while (it.hasNext()) {
			System.out.println(it.next() + "\t");
			
		}*/
		
		System.out.println("������ ���");
		
		/*
		 * ��Ŭ���� �������� �ڵ�������Ű��
		 * �Ʒ� ���ǽĿ� it.hasNext() �� �����ȴ�.
		 * ���� ����� ���ؼ��� hasPrevious() ��� �ٲ��ش�.
		*/
		
		while (it.hasPrevious()) {
			// �Ʒ� �޼ҵ嵵 previous()�ٲ�� �Ϳ� ���� !!
			System.out.print(it.previous() + "\t");
			
		}
	}
}
