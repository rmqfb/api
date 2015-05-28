package api.util.vector;

import java.util.Vector;

/*
 * java.util.Vector �� �޼ҵ���
 * add() �� ���Ϳ� ���� �Ҵ��ϴ� ����� �Ѵ�.
*/
public class AddDemo {
	public static void main(String[] args) {
		String id = "admin";
		int age = 27; // ����
		Boolean male = true; // ����
		
		Vector<String> vec = new Vector<String>();  // Vector vec = new Vector(); ������ ��Ƶ� �Ǵ� ...
		//String tom = new String("admin");
		Boolean gender = new Boolean(false);
		
		vec.add(new String("admin"));
		vec.add(String.valueOf(23));
		vec.add(String.valueOf(gender));
		vec.add("���ͷ� ���ڷ� ������ ��ü");
		// vec.add(2); int ���� �ƿ� ������ �߻�
		
		// ���� !!!
		// ���ʹ� length() �� ������� �ʰ�
		// size() ��  ����� ���ڸ� ǥ���ϴµ� ����Ѵ�.
		
		// �迭���� for loop ��½� get(arr[i]) ������
		// ���ʹ� elementAt(i) �Դϴ�.
		for(int i = 0; i<vec.size(); i++){
			System.out.println("������ " + (i+1) + "��° ��Ҵ� : "+vec.elementAt(i));
		}
		/*
		 * ��µ� ����� : 
		 * ������ 1��° ��Ҵ� : admin
		 * ������ 2��° ��Ҵ� : 23 ==> ����ó�� �������� ����� String ���ͷ�
		 * ������ 3��° ��Ҵ� : false ==> boolean Ÿ���� �ƴ϶� String ��
		 * ������ 4��° ��Ҵ� : ���ͷ� ���ڷ� ������ ��ü ==> ���ͷ� ��ü�� ��� ����
		*/
	}
}
