package api.util.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService{
	
	MemberVO vo = new MemberVO();
	Map<String, Object> map = new HashMap<String, Object>();  // Impl ��ü = new Ŭ����  �������̽� �� ������ ���ؼ� �ؽ��� ��ü �����Ѱ���
	// key�� String ���� ���Ǯ ó�� �ؾ�... ��... 
	// hashMap ���� �ؾ� id ���� ������ password �� ȣ���ϰڱ���..
	@Override
	public void join(String id, String password, String name, int age, String addr) {
		// �� ������ DB�� �����ϴ� ���ϰ� ��ġ�Ѵ�.
		// ��, ���� Ȱ���ϸ鼭 �����ǰų� ������ �� �ֱ⿡
		// ���� ���� �������� DB �� �����ϰ� ����.
		vo.setId(id);
		vo.setPassword(password);
		vo.setName(name);
		vo.setAge(age);
		vo.setAddr(addr);  // db�� �ִ� ������ ������ join�� �����ŷ�/
		
		// 1. ù��° ���� ����
		// map.put(vo.getId(), vo.getPassword());
		
		// Map�� ���׸��� put�� ���� Ÿ���̴�.
		map.put("id", vo.getId()); 
		map.put("password", vo.getPassword());
		map.put("name", vo.getName());
		// Ű�� ��� ���Ͽ��� ������� String ���� ���Ͻ�Ű����
		// int Ÿ������ ���� age�� String Ÿ������ ��ȯ��.
		map.put("age", String.valueOf(vo.getAge()));
		map.put("addr", vo.getAddr());
		
		// 2. �ι�° ���� ����
		// map.put("age",vo.getAge()); // valueOf �� ������
		
	}
	// MemberMain ���� ȸ������ �� �α��� ����� �ϴ� �޼ҵ����Ŀ� ���ٸ� ���� �����ϱ�...
	// �α��� ����, ���� �޽������� ���⿡�� ��������� ��.
	@Override
	public void login(String id, String password) {
		// ��¹� ����
		// �Է��Ͻ� ID �� �������� �ʰų�, ��ġ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���.
		// ����� �ٸ��ϴ�. �ٽ� �Է��ϼ���.
		// ȯ���մϴ�. ����ÿ� ��� 20�� ȫ�浿�� ..
		
		// 3. ����° ���� ����
		// map.get(id); => �Ķ���� ������ �ݵ�� String ���� �ؾ� ��.
		
		if(map.get("id").equals(id) && map.get("password").equals(password)){  // ���� &&
			System.out.println("ȯ���մϴ�. " + vo.getAddr() +" �� ��� " + vo.getAge() + "�� " + vo.getName() + "��");
		}else if(!(map.get("id").equals(id)) && map.get("password").equals(password)){  // or�� ������ ����� �ٸ��Ŷ� ���̵� �ٸ��Ŷ� ���ü��� ����..
			System.out.println("�Է��Ͻ� ID �� �������� �ʰų�, ��ġ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���.");
		}else {
			System.out.println("����� �ٸ��ϴ�. �ٽ� �Է��ϼ���.");
		}
	}

}
