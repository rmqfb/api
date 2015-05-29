package api.util.vector;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
		GradeVO vo1 = new GradeVO();
		vo1.setEng(60);
		vo1.setHak("20150529");
		vo1.setKor(70);
		vo1.setMath(50);
		vo1.setName("ȫ�浿");
		
		GradeVO vo2 = new GradeVO();
		vo2.setEng(60);
		vo2.setHak("20150528");
		vo2.setKor(70);
		vo2.setMath(50);
		vo2.setName("��浿");
		
		GradeVO vo3 = new GradeVO();
		vo3.setEng(60);
		vo3.setHak("20150527");
		vo3.setKor(70);
		vo3.setMath(50);
		vo3.setName("��浿");
		
		GradeServiceImpl service = new GradeServiceImpl();
		service.input(vo1);
		service.input(vo2);
		service.input(vo3);
		System.out.println("20150529 ���� ������ȸ : " + service.searchGradeByHak("20150529"));
		
		// �÷��� ������  <Ŭ����Ÿ��> �� ���׸� �̶�� Ī��.
		// Ư���� ����� ���ϴ� ���� �ƴϰ� �÷��� ���ο���
		// Ÿ�� ĳ������ �Ѵٶ�� �����ϰ� �����ص� ������
		Vector<String> vc = service.searchGradeByName("��浿");
		
		for(int i=0; i<vc.size(); i++){  // java.lang.NullPointerException ���� ������ �����Ͱ� ����Ű�� �� ������ ������ . ���� ���� null �̴� ��� ���̴�.  >> . ���� vc �� null ���̴�.
			System.out.println(vc.elementAt(i));
		}
		
	}
}
