package api.lang.string;

/*
 * java.lang.String 메소드
 * replace("OLD","NEW") : String 문자열에서 "OLD" 글자를
 * "NEW" 글자로 대체한다
 * 만약 대체하는 글자가 복수이면 replaceAll() 을 사용한다.
*/
public class ReplaceDemo {
	public static void main(String[] args) {
		System.out.println("Hello Tom".replace("Tom", "Alex")); // 한단어 일때 Tom 을 Alex 로 바꿔라
		System.out.println("A B C D : A B C D".replaceAll(" C D", " E F"));  // CD 를 EF 로 바꿔라  한개 이상일때.
	}
}
