package api.lang.math;

import java.util.Scanner;

/*
 * java.lang.Math �� ����
 * random() �޼ҵ�� ������ ������Ű�� ����� �Ѵ�.
*/
public class RandomDemo {
	public static void main(String[] args) {
		int com = (int) (Math.random()*5)+1;
		/*
		 * �� �������� 5�� limit ���̰� 1�� begin ���̴�.
		 * ���� �� ������ 1���� 5���� ����(��������)��
		 * �߻���Ű��� �����̴�.
		*/
		
		int myVal;
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while(true){
			i++;
			System.out.println("1���� 5���� ���� ���߱� �Դϴ�." + "�� 3���� ��ȸ�� �ֽ��ϴ�.");
			System.out.println("����� " + i + "��° �õ��Դϴ�.");
			myVal = scanner.nextInt();
			if(myVal == com){
				System.out.println("��ǻ�Ͱ� �߻��� ���� : " +  com);
				System.out.println("���� �����Ӵϴ�.");
				break;
			}
			if(i == 3){
				System.out.println("�����Դϴ�.");
				break;
				
			}
		} // ������ ȸ�������Ҷ� ���(������, ȸ��)
	}

}
