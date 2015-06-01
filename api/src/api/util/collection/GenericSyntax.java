package api.util.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * ���׸�(generics)
 * - �÷����� ������ ���
 * - ��� ������ ������ Ÿ���� �ٷ� �� �ֵ��� �Ϲ�ȭ�� Ÿ��
 * - �Ű������� Ŭ������ �޼ҵ带 �ۼ��ϴ� ���
 * 		�÷��� Ŭ�������� Ÿ�� �Ķ���ͷ� ���Ǵ� ���ڴ� �ٸ� ������
 * 		ȥ���� ���ϱ� ���� �Ϲ������� ������ ���� ǥ����.
 * 		E : Element Set<E> set
 * 		T : Type Set<T> set
 * 		V : value
 * 		K : Key Map<K,V>
*/

/*
 * ���׸��� ���������� Ÿ�Կ� ���ؼ��� ����� �� �ִ�.
 * �⺻ ������ Ÿ�Կ����� ����� �� ����.
 * Ŭ������ ������ ���� ������ Ÿ���� �������� �ʰ�
 * �ν��Ͻ� ������ �� ������ Ÿ���� �����ϴ� ���
*/
public class GenericSyntax {
	public <E> Object test(Set<E> map){  // �Ű������� ����Ÿ���� ���¸� ����  >> �ذ��� : �׳� ������Ʈ �ְ� ĳ���� �ϸ� ��
		return null;
	}
	
	public <K,V> void test2(){  // ����Ÿ���� void �ε���, <K,V> ������ �ΰڴ�.  
		Map<K,V> map = new HashMap<K,V>();
	}
}
