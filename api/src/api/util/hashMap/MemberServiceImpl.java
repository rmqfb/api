package api.util.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService{
	
	MemberVO vo = new MemberVO();
	Map<String, Object> map = new HashMap<String, Object>();  // Impl 객체 = new 클래스  인터페이스 맵 선언을 통해서 해쉬맵 객체 생성한거임
	// key를 String 으로 상수풀 처리 해야... 음... 
	// hashMap 으로 해야 id 값을 가지고 password 를 호출하겠구나..
	@Override
	public void join(String id, String password, String name, int age, String addr) {
		// 이 패턴은 DB에 저장하는 패턴과 일치한다.
		// 즉, 값을 활용하면서 오염되거나 변질될 수 있기에
		// 가장 먼저 순수값을 DB 에 저장하고 본다.
		vo.setId(id);
		vo.setPassword(password);
		vo.setName(name);
		vo.setAge(age);
		vo.setAddr(addr);  // db에 넣는 과정이 끝나면 join은 끝난거래/
		
		// 1. 첫번째 에려 유형
		// map.put(vo.getId(), vo.getPassword());
		
		// Map의 제네릭은 put의 인자 타입이다.
		map.put("id", vo.getId()); 
		map.put("password", vo.getPassword());
		map.put("name", vo.getName());
		// 키와 밸류 패턴에서 밸류값을 String 으로 통일시키려고
		// int 타입으로 들어온 age를 String 타입으로 변환함.
		map.put("age", String.valueOf(vo.getAge()));
		map.put("addr", vo.getAddr());
		
		// 2. 두번째 에러 유형
		// map.put("age",vo.getAge()); // valueOf 를 안해줌
		
	}
	// MemberMain 에서 회원가입 후 로그인 기능을 하는 메소드이후에 별다른 말이 없으니까...
	// 로그인 성공, 실패 메시지까지 여기에서 마감지어야 함.
	@Override
	public void login(String id, String password) {
		// 출력문 예시
		// 입력하신 ID 는 존재하지 않거나, 일치하지 않습니다. 다시 입력해 주세요.
		// 비번이 다릅니다. 다시 입력하세요.
		// 환영합니다. 서울시에 사는 20세 홍길동님 ..
		
		// 3. 세번째 에러 유형
		// map.get(id); => 파라미터 유형은 반드시 String 으로 해야 함.
		
		if(map.get("id").equals(id) && map.get("password").equals(password)){  // 논리곱 &&
			System.out.println("환영합니다. " + vo.getAddr() +" 에 사는 " + vo.getAge() + "세 " + vo.getName() + "님");
		}else if(!(map.get("id").equals(id)) && map.get("password").equals(password)){  // or로 넣으면 비번이 다른거랑 아이디가 다른거랑 나올수가 없대..
			System.out.println("입력하신 ID 는 존재하지 않거나, 일치하지 않습니다. 다시 입력해 주세요.");
		}else {
			System.out.println("비번이 다릅니다. 다시 입력하세요.");
		}
	}

}
