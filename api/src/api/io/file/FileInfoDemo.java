package api.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class FileInfoDemo {
	public static void main(String[] args) {
		System.out.println("���� �̸��� ��������");
		String name = ""; // ���������� �ʱ�ȭ �ؾ� ��
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			name = in.readLine(); // �� ������ �о����
		}catch(Exception ex){
			ex.printStackTrace();
		}
		File file = new File(name); // name �ʱ�ȭ ����� ��
		if(file.exists()){
			System.out.println("���� �̸� : " + file.getName());
			System.out.println("���� ��� : " + file.getPath());
			System.out.println("���Ⱑ�ɿ��� : " + file.canWrite());
			System.out.println("�бⰡ�ɿ��� : " + file.canRead());
			System.out.println("���� ���� : " + file.length() + "����Ʈ");
			
		}else {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		}
	}
}


/* ��� ���
���� �̸��� ��������
C:\test.txt  // ���� ���� ��� �Է��ϱ� // �̸� ������ ��������..
���� �̸� : test.txt
���� ��� : C:\test.txt
���Ⱑ�ɿ��� : true
�бⰡ�ɿ��� : true
���� ���� : 15����Ʈ
*/