package api.util.hashSet;

import java.util.HashSet;
import java.util.Set;

/*
 * java.util.HashSet �� �޼ҵ���
 * add() �� ����ó�� ����� �߰� ����� �Ѵ�.
*/
/*
 * Set �� ��ü�� �߰��� �� HashSet �� �̹� �ִ� ��ü���
 * �ߺ����� �����ϰ� �������� �ʴ´�.
 * �׸��� false �� �����Ѵ�.
*/

/*
 * Collection => �ڷᱸ��
 * 		�� List 
 * 
 * Collection ==> List, Set, Map, Tree �̷��� ������

List ����Ʈ�� ���� ����Ǿ� �ְ� size�ҽ� �� �þ  ���Ľ�ų�� ���...sort? (add �߰��ϴ¿뵵)

set ���ָӴ�  ....�ߺ����� (add �߰��ϴ¿뵵)

map ���״�� ���� ( push ����Ʈ�� �����ؼ� �������� ����� ���������� ������ �˻��ȴ�.. �˻��� ���̾���) 

tree ���� �Ⱦ��� ����...�ٸ� �ڹٽ�ũ��Ʈ���� ���� ���δ� (ȭ���)
*/
public class AddDemo {
	public static void main(String[] args) {
		Object[] arr = {"1", new Integer(2), "2", "3", "3", "3", "4"};
		// ��Ŭ���� ���� �� java.util.Set �߰�
		Set set = new HashSet();
		for(int i=0; i<arr.length; i++){
			set.add(arr[i]);
		}
		System.out.println("������ ��� : " + set);
		/*
		 * ������ ��� : [3, 2, 2, 1, 4] �̷��� ��µǴµ�,
		 * �̰ɷ� ���� new Integer(2) �� "2" �� ���� �ٸ� ��ü? ��� �ƴѰ�..?�̹Ƿ�
		 * �ߺ����� �������� �ʴ´ٴ� ���� �� �� �ִ�.
		*/
	}
}
