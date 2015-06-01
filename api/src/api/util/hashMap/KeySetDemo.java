package api.util.hashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//import java.util.*; �ƽ�Ÿ ǥ�ô� ���ҽ��� ��Ƹ��� ������, �ε��ӵ��� ������ (�˻� ������ �о)

public class KeySetDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		// Map �� ���� �Է��ϴ� ��� => 1������ ����
		
		map.put("�迬��", new Integer(98));
		map.put("�ƻ�ٸ���", new Integer(66));
		map.put("��Ʈ�� �ڹ�", new Integer(10));
		
		// Gof �� ������ ���� �߿���
		// Iterator �����̶�� �Ҹ���� Map ���� ���� �����ϴ� ����ȭ�� �����̴�.
		
		// �ʿ��� Ű���� ������� ���� ��Ȳ�� ���� ����� ����
		// entrySet() ���
		// �ʿ��� Ű���� ����� ���
		// keySet() ���
		// ��, ��� ������ Set �̿�
		// ������ ?  �÷��ǿ���
		// �������̽��� Set, List, Map ������ ��ǥ���ε�,
		// Set �� Map �� �ε��� ���� ��� ��ȣ ȣȯ�� �� �ǰ�,
		// Set �� �ߺ��� ���� ����� �־
		// Map ���� Ű������ �ߺ��� ����� �ϴ� �κа��� ��ġ��
		// Set �� ���� Ű��, Ȥ�� Ű+����� �� ����ϴµ� ���δ�.
		// ����� ���� Iterator �� ���
		// Set �� Iterator �� ����ϱ� �����̴�.
		
		/*
		 *  Map ���� ���� ����ϴ� ���� 3�����ε�,
		 *  ù��°�� Ű + ��� ���·� �Բ� ����ϴ� ���
		 *  entrySet() + Iterator ���� ���
		*/
		Set set = map.entrySet();  // �ּҰ��� �ѱ��.
		Iterator it = set.iterator();  // set �� ���ͷ�����(���� �ִ��� �Ⱦ�� ���)�� �־ �ּҰ��� �ѱ� �۾��� �Ѱ��� / ��.���ͷ����Ͱ� ���� �ִ� �ּҰ��� it�� �ѱ�
		
		while(it.hasNext()){
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("������ : " + e.getKey() + ", ���� : " + e.getValue());
		}
		
		/*
		 *  Map ���� ���� ����ϴ� ���� 3�����ε�,
		 *  �ι�°�� Ű �鸸 ����ϴ� ���
		 *  keySet() ���
		*/
		set = map.keySet();
		System.out.println("������ ��� : " + set);
		
		/*
		 *  Map ���� ���� ����ϴ� ���� 3�����ε�,
		 *  ����°�� ���(��) �鸸 ����ϴ� ���
		 *  Collection ���
		*/
		// Collection ���� ��Ŭ���� ���� �߿��� java.util.Collection ����
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			total += i.intValue();
			
		}
		System.out.println("���� : " + total);
		// Set �� List �迭�� Ŭ����ó�� ����� ������ size() �� �Ѵ�.
		System.out.println("��� : " + total/set.size());
		// Collection.max �� �ִ밪, .min �� �ּҰ��� �����Ѵ�.
		System.out.println("1�� : " + Collections.max(values));
		System.out.println("���� : " + Collections.min(values));
		
		
	}
}
