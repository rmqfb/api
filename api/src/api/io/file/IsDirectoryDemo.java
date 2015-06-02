package api.io.file;

import java.io.File;

/*
 * java.io.File �� �޼ҵ���
 * isFile() // �ش� ������ �ִ��� ���θ� Ȯ��, ������ false
 * isDirectory() // �ش� �н��� ���丮(����) �� �����ϴ���, ������ false
*/

/*
 * ���丮 vs ���� : ���� ���� �ǹ��̴�. �׷��� �ణ�� �ǹ��� ���̰� �ִ�.
 * ���丮(directory) : �ؽ�Ʈ ���� cmd â���� ���� ���нÿ� �ǹ̰� £��.
 * ����(folder) : GUI ��忡�� ������ �־� �δ� ���� �ǹ̰� ���ϴ�.
 * 			������ ������ �� ��ü�� Windows 3.5 �̻��� �������� �����ߴ�.
 * 			���� DOS ��忡���� ���丮�� ���� ���.
*/
public class IsDirectoryDemo {
	public static void main(String[] args) {
		// String directory = "C:/test.txt";   ������ �ƴ�
		// String directory = "c:" + File.separator + "temp";    //"c:\temp";  // test.txt�� �־���� ��
		String directory = "E:" + File.separator + "pm";
		// File.separator ���丮 �����ڰ� ��Ȯ�� �� ��
		// �������� �����ڸ� ȣ���ϴ� Ŭ��������
		
		// import ����Ű ctrl + shift + o
		File file = new File(directory);
		//���丮���� �˻�
		if(file.isDirectory()){
			System.out.println("�˻� ���丮 : " + directory);
			System.out.println("���丮 �������� ���");
			String str[] = file.list();
			for(int i=0; i<str.length; i++){
				File file2 = new File(directory + "\\" + str[i]);
				if(file2.isDirectory()){
					System.out.println(str[i] + " : ���丮");
				}else{
					System.out.println(str[i] + " : ����");
				}
			}
		}else{
			System.out.println("������ " + directory + "�� ���丮�� �ƴ�");
		}
	}
}
