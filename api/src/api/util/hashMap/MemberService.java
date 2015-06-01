package api.util.hashMap;

public interface MemberService {

	// 회원가입 기능을 하는 메소드
	public void join(String id, String password, String name, int age, String addr);

	// 회원가입 후 로그인 기능을 하는 메소드
	public void login(String id, String password);
	
}
