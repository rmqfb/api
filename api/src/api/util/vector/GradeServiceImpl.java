package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{
	private Vector<GradeVO> grades = new Vector<GradeVO>();
	@Override
	public void input(GradeVO vo) {
		grades.add(vo);
		
	}
	
	/*
	 * ����ǥ�� ����ϴ� �޼ҵ�
	 * vo.toString() ���� ó�� �����ϰ� ����.
	*/
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * �й����� �˻��ϴ� ����� ���� �޼ҵ�
	*/
	@Override
	public String searchGradeByHak(String hak) {
		
		// ���ʹ� size() �� limit �� ǥ����
		// Ȯ��� for ���� ���ǽ� Ÿ���� (Ÿ�� �������� : �÷���)
		String result = "";
		for(GradeVO vo : grades){
			if(vo.getHak().equalsIgnoreCase(hak)){
				result =  vo.toString();
			}else{
				result = "��ȭ�� �й��� �ش��ϴ� �л��� �����ϴ�.";
			}
		}
		return result;
	}

	/*
	 * �̸����� ������ �˻��ؼ� ����ϴ� �޼ҵ�
	*/
	@Override
	public Vector<String> searchGradeByName(String name) {
		Vector<String> vc = new Vector<String>();
		// ���ͳ� ��Ÿ �÷��� ����� �ϰ� �Ǹ�...
		// ���ͷ����� �ƴϸ� Ȯ�� for ������ ó���Ѵ�.
		// �ֳĸ� Ȯ�� for ���� �ε����� ������ �ʱ� ����.. ������ ��ü ���
		
		// grades �� �� �� �ִ� ������ ����ʵ忡 �����Ͽ�
		// ���� Ŭ���� ������ �޼ҵ���� ���� �����ϱ� �����̴�.
		for(GradeVO vo : grades){
			if(vo.getName().equalsIgnoreCase(name)){
				// �Ķ���ͷ� �Ѿ�� �̸��� ������ vo ��ü��
				// ã�Ƽ� String ���·� ���Ϳ� �����Ѵ�.
				// �� vc �� String Ÿ���̶� �� �����ϱ�!
				// GradeVO Ÿ���� �ƴϴ�.
				vc.addElement(vo.toString());
			}
		}
		
		return vc;  // ���ϰ��� ���� ������ ������ �����̴�.
	}

	/*
	 * �������� �������� ������������ ���Ľ�Ű�� �޼ҵ�
	*/
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}

	/*
	 * �������� �������� ������������ ���Ľ�Ű�� �޼ҵ�
	*/
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}

}
