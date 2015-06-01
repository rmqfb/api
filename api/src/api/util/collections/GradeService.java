package api.util.collections;

import java.util.Vector;

public interface GradeService {
	
	
	/*
	 * vo ��ü�� ���Ϳ� �����ϴ� ���
	*/
	public void input(GradeVO vo);
	public void print();
	
	/*
	 * �й��� �̿��ؼ� ����ǥ�� ��� ==> complete !!
	*/
	public String searchGradeByHak(String hak);
	
	/*
	 * �̸��� �̿��� ���� ����ε� �������� ���̽����� Ŀ���ϱ� ����
	 * ���ϰ��� ���ͷ� �޾ƾ� �ڴ�.
	*/
	public Vector<String> searchGradeByName(String name);
	public void descGradeTotal();
	public void ascGradeTotal();
}
