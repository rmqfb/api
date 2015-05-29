package api.util.hashSet;

import java.util.HashSet;
import java.util.Set;

/*
 * java.util.HashSet 의 메소드인
 * add() 는 벡터처럼 요소의 추가 기능을 한다.
*/
/*
 * Set 은 객체를 추가할 때 HashSet 에 이미 있는 객체라면
 * 중복으로 간주하고 저장하지 않는다.
 * 그리고 false 를 리턴한다.
*/

/*
 * Collection => 자료구조
 * 		└ List 
 * 
 * Collection ==> List, Set, Map, Tree 이렇게 구조됨

List 디폴트에 값이 저장되어 있고 size할시 쭉 늘어남  정렬시킬때 사용...sort? (add 추가하는용도)

set 복주머니  ....중복제거 (add 추가하는용도)

map 말그대로 지도 ( push 포인트를 지정해서 실제값과 밸류값 직관적으로 빠르게 검색된다.. 검색때 많이쓰임) 

tree 거의 안쓰는 구조...다만 자바스크립트에서 많이 쓰인다 (화면단)
*/
public class AddDemo {
	public static void main(String[] args) {
		Object[] arr = {"1", new Integer(2), "2", "3", "3", "3", "4"};
		// 이클립스 제안 중 java.util.Set 추가
		Set set = new HashSet();
		for(int i=0; i<arr.length; i++){
			set.add(arr[i]);
		}
		System.out.println("저장요소 출력 : " + set);
		/*
		 * 저장요소 출력 : [3, 2, 2, 1, 4] 이렇게 출력되는데,
		 * 이걸로 보아 new Integer(2) 와 "2" 는 서로 다른 객체? 요소 아닌가..?이므로
		 * 중복으로 간주하지 않는다는 것을 알 수 있다.
		*/
	}
}
